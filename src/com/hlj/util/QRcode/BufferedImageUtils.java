package com.hlj.util.QRcode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.junit.Test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/10/29  下午4:31.
 * 类描述：
 */
public class BufferedImageUtils {


    /**
     *
     * 1、 输出图片到本地目录
     * @param buffImg 图片
     * @param savePath 本地目录的路径
     */
    public static void  saveImageToLocalDir(BufferedImage buffImg, String savePath) {
        try {
            ImageIO.write(buffImg, "jpg", new File(savePath));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }



    /**
     *
     * 2、 方法描述: 多个图片合成
     * exImage 底图
     * innerImage 嵌入的图片
     * x 坐标x
     * y 坐标y
     * innerImageWedith 嵌入图片的长度
     * innerImageHeight 嵌入图片的宽度
     */
    public  static BufferedImage imageAndImages(BufferedImage exImage, BufferedImage innerImage, int x, int y, int innerImageWedith, int innerImageHeight, float alpha) throws IOException {
        Graphics2D g2d = exImage.createGraphics();
        // 在图形和图像中实现混合和透明效果
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
        // 绘制
        g2d.drawImage(innerImage, x, y, innerImageWedith, innerImageHeight, null);
        g2d.dispose();// 释放图形上下文使用的系统资源
        return exImage;
    }

    /**
     * 2、测试 多个图片合成
     */
    @Test
    public void testimageAndImages(){

        String sourceFilePath = "/Users/healerjean/Desktop/origin.jpeg";
        String innerImageFilePath = "/Users/healerjean/Desktop/img.jpeg";
        // 构建叠加层
        BufferedImage buffImg = null;
        try {
            buffImg = imageAndImages(ImageIO.read(new File(sourceFilePath)), ImageIO.read(new File(innerImageFilePath)),595, 1000,245 ,245, 1.0f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 输出水印图片
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(buffImg, saveFilePath);
    }


    /**
     * 3、不带logo的二维码
     *
     * @param text 二维码内容
     * @param width 二维码宽度
     * @param height 长度
     * @param whiteSize 白边大小
     * @return
     */
    public static BufferedImage writeQRImg(String text,int width,int height,int whiteSize){
        // 配置参数
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // 字符编码
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        // 容错级别
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // 设置空白边距的宽度
        hints.put(EncodeHintType.MARGIN, whiteSize); // 默认是4

        // 1、生成二维码
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        // 2、获取二维码宽高
        int codeWidth = bitMatrix.getWidth();
        int codeHeight = bitMatrix.getHeight();

        // 3、将二维码放入缓冲流
        BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < codeWidth; i++) {
            for (int j = 0; j < codeHeight; j++) {
                // 4、循环将二维码内容定入图片
                //判断 BitMatrix 是否存在像素  二维码填充颜色 黑色  0XFF000000 白色 ：0xFF是补码 0XFFFFFFFF
                image.setRGB(i, j, bitMatrix.get(i, j) ? 0XFF000000 : 0XFFFFFFFF);
            }
        }

        return image ;
    }

    /**
     * 3、测试 不带logo的二维码
     * @throws Exception
     */
    @Test
    public void testWriteQRImg(){
        String text = "http://blog.healerjean.top";
        BufferedImage  noLogoImage = writeQRImg(text,200,200, 0 );
        //存储到本地
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(noLogoImage, saveFilePath);
    }





    /**
     *  4、 读取二维码的文件里面的信息
     */
    public static String readQRImg(BufferedImage image) throws Exception {

        LuminanceSource source = new BufferedImageLuminanceSource(image);
        Binarizer binarizer = new HybridBinarizer(source);
        BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
        Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
        // 字符编码
        hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
        Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码
        return result.getText();
    }

    /**
     * 4、测试 读取二维码信息
     * @throws Exception
     */
    @Test
    public void testReadQRImg() throws Exception{
        //读取二维码信息
        String filePath = "/Users/healerjean/Desktop/new.png";
        BufferedImage image = ImageIO.read(new File(filePath));
        String info =readQRImg(image);
        System.out.println(info);
    }



    /**
     *   5、 生成带logo的二维码
     *
     *
     * @param text 二维码内容
     * @param text 二维码内容
     * @param width 二维码宽度
     * @param height 长度
     * @param whiteSize 白边大小
     * @param logo LOGO图片
     * @return
     * @throws Exception
     */
    public static BufferedImage createLogoQRImg(String text,int width,int height, int whiteSize,BufferedImage logo) throws Exception {
        // 配置参数
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // 字符编码
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        // 容错级别
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // 设置空白边距的宽度
        hints.put(EncodeHintType.MARGIN, whiteSize); // 默认是4

        // 1、生成二维码
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        // 2、获取二维码宽高
        int codeWidth = bitMatrix.getWidth();
        int codeHeight = bitMatrix.getHeight();

        // 3、将二维码放入缓冲流
        BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < codeWidth; i++) {
            for (int j = 0; j < codeHeight; j++) {
                // 4、循环将二维码内容定入图片
                //判断 BitMatrix 是否存在像素  二维码填充颜色 黑色  0XFF000000 白色 ：0xFF是补码 0XFFFFFFFF
                image.setRGB(i, j, bitMatrix.get(i, j) ? 0XFF000000 : 0XFFFFFFFF);
            }
        }

            //在原来基础上，再添加一个图片
            Graphics2D g = image.createGraphics();
            int widthLogo = logo.getWidth(null) > image.getWidth() * 2 / 10 ?
                    (image.getWidth() * 2 / 10) : logo.getWidth(null);
            int heightLogo = logo.getHeight(null) > image.getHeight() * 2 / 10 ?
                    (image.getHeight() * 2 / 10) : logo.getHeight(null);

            //设定在图片中间
            int x = (image.getWidth() - widthLogo) / 2;
            int y = (image.getHeight() - heightLogo) / 2;

            // 开始绘制图片
            g.drawImage(logo, x, y, widthLogo, heightLogo, null);

            //绘制圆角矩形
            g.drawRoundRect(x, y, widthLogo, heightLogo, 15, 15);

            //边框宽度
            g.setStroke(new BasicStroke(2));

            //边框颜色
            g.setColor(Color.WHITE);
            g.drawRect(x, y, widthLogo, heightLogo);

            g.dispose();
            logo.flush();
            image.flush();
            return image;
    }




    /**
     * 5、测试 带logo的二维码
     * @throws Exception
     */
    @Test
    public void testWriteQRImgWithLogo() throws Exception{
        String text = "http://blog.healerjean.top";
        String logoPath = "/Users/healerjean/Desktop/logo.png";
        BufferedImage logo = ImageIO.read(new File(logoPath));
        BufferedImage  logoImage = createLogoQRImg(text,200,200, 1 ,logo);

        //存储到本地
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(logoImage, saveFilePath);
    }




    /**
     * 6/ 指定图片宽度和高度和压缩比例对图片进行压缩
     * @param widthdist 压缩后图片的宽度
     * @param heightdist 压缩后图片的高度
     * @param rate 压缩的比例 ,可以设置为null
     */
    public static BufferedImage reduceImg(BufferedImage bufferedImage, int widthdist, int heightdist, Float rate) {
        try {

            // 如果比例不为空则说明是按比例压缩
            if (rate != null && rate > 0) {
                //获得源图片的宽高存入数组中
                int results[] = { 0, 0 };
                results[0] =bufferedImage.getWidth(null); // 得到源图片宽
                results[1] =bufferedImage.getHeight(null);// 得到源图片高

                if (results == null || results[0] == 0 || results[1] == 0) {
                    return null;
                } else {
                    //按比例缩放或扩大图片大小，将浮点型转为整型
                    widthdist = (int) (results[0] * rate);
                    heightdist = (int) (results[1] * rate);
                }
            }
            // 开始读取文件并进行压缩
            Image src = (Image) bufferedImage;
            // 构造一个类型为预定义图像类型之一的 BufferedImage
            BufferedImage tag = new BufferedImage((int) widthdist, (int) heightdist, BufferedImage.TYPE_INT_RGB);
            //绘制图像  getScaledInstance表示创建此图像的缩放版本，返回一个新的缩放版本Image,按指定的width,height呈现图像
            //Image.SCALE_SMOOTH,选择图像平滑度比缩放速度具有更高优先级的图像缩放算法。
            tag.getGraphics().drawImage(src.getScaledInstance(widthdist, heightdist, Image.SCALE_SMOOTH), 0, 0, null);

            return tag;
        } catch (Exception ef) {
            ef.printStackTrace();
        }
        return  null;
    }

    /**
     * 6 测试
     * @throws IOException
     */
    @Test
    public void testReduceImg() throws IOException {
        String reducePath = "/Users/healerjean/Desktop/reduce.png";
        BufferedImage originImage = ImageIO.read(new File(reducePath));
        BufferedImage  reduceImg = reduceImg(originImage,200,200, null );

        //存储到本地
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(reduceImg, saveFilePath);
    }


    /**
     *  7、 添加文字水印
     * @param image 需要加水印的文件
     * @param waterText 水印文本
     * @param moreMark  是否是多个水印 true多个水印   /false 或不写，一个水印
     * @return
     */
    public static BufferedImage textWaterMark(BufferedImage image,String waterText, boolean... moreMark) {

            //字体样式
            int FONT_STYLE = Font.BOLD;
            //字体大小
            int FONT_SIZE = 50;
            //字体颜色
            Color FONT_COLOR = Color.black;
            //字体颜色
            String FONT_NAME = "微软雅黑";
            //透明度
            float ALPHA = 0.3F;

            //多图的情况下，水印的间距
            Integer MORE_MARK_DISTANCE = 100;

            //计算原始图片宽度长度
            int width = image.getWidth();
            int height = image.getHeight();
            //创建图片缓存对象
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //创建java绘图工具对象
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //参数主要是，原图，坐标，宽高
            graphics2d.drawImage(image, 0, 0, width, height, null);

            //使用绘图工具将水印绘制到图片上
            //计算文字水印宽高值
            int waterWidth = FONT_SIZE*getTextLength(waterText);
            int waterHeight = FONT_SIZE;
            //水印透明设置
            graphics2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ALPHA));
            graphics2d.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
            graphics2d.setColor(FONT_COLOR);

            if(moreMark!= null && moreMark.length >0 && moreMark[0]){
                //设定旋转 ， 后面两个参数表示的是围绕那个坐标
                graphics2d.rotate(Math.toRadians(-30), bufferedImage.getWidth()/2, bufferedImage.getHeight()/2);

                int x = -width/2;
                int y = -height/2;

                while(x < width*1.5){
                    y = -height/2;
                    while(y < height*1.5){
                        graphics2d.drawString(waterText, x, y);
                        //水印的间距
                        y+=waterHeight+MORE_MARK_DISTANCE;
                    }
                    x+=waterWidth+MORE_MARK_DISTANCE;
                }
            }else{
                graphics2d.drawString(waterText, width-waterWidth, height);
            }

            //写图片
            graphics2d.dispose();
            return  bufferedImage;
    }
    /**
     * 计算水印文本长度
     *
     * 中文长度即文本长度 2、英文长度为文本长度二分之一
     * @param text
     * @return
     */
    private static int getTextLength(String text){
        //水印文字长度
        int length = text.length();

        for (int i = 0; i < text.length(); i++) {
            String s =String.valueOf(text.charAt(i));
            if (s.getBytes().length>1) {
                length++;
            }
        }
        length = length%2==0?length/2:length/2+1;
        return length;
    }

    @Test
    public void testTextWaterMark() throws IOException {
        String originPath = "/Users/healerjean/Desktop/reduce.png";
        BufferedImage originImage = ImageIO.read(new File(originPath));
        BufferedImage newImage = textWaterMark(originImage,"healerjean",true);

        //存储到本地
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(newImage, saveFilePath);
    }





    /**
     * 8、 添加图片水印
     * @param
     * @return
     */
    public static BufferedImage imageWaterMark(BufferedImage image,BufferedImage imageLogo, boolean... moreMark) {
        //字体样式
        int FONT_STYLE = Font.BOLD;
        //字体大小
        int FONT_SIZE = 50;
        //字体颜色
        Color FONT_COLOR = Color.black;
        //字体颜色
        String FONT_NAME = "微软雅黑";
        //透明度
        float ALPHA = 0.3F;
        //多图的情况下，水印的间距
        Integer MORE_MARK_DISTANCE = 100;

        int X = 636;
        int Y = 763;
            //计算原始图片宽度长度
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            //创建图片缓存对象
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //创建java绘图工具对象
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //参数主要是，原图，坐标，宽高
            graphics2d.drawImage(image, 0, 0, width, height, null);
            graphics2d.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
            graphics2d.setColor(FONT_COLOR);

            //水印图片路径
            int widthLogo = imageLogo.getWidth(null);
            int heightLogo = imageLogo.getHeight(null);
            int widthDiff = width-widthLogo;
            int heightDiff = height-heightLogo;
            //水印坐标设置
            if (X > widthDiff) {
                X = widthDiff;
            }
            if (Y > heightDiff) {
                Y = heightDiff;
            }
            //水印透明设置
            graphics2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ALPHA));

            if(moreMark!= null && moreMark.length >0 && moreMark[0]){
                graphics2d.rotate(Math.toRadians(-30), bufferedImage.getWidth()/2, bufferedImage.getHeight()/2);

                int x = -width/2;
                int y = -height/2;

                while(x < width*1.5){
                    y = -height/2;
                    while(y < height*1.5){
                        graphics2d.drawImage(imageLogo, x, y, null);
                        y+=heightLogo+MORE_MARK_DISTANCE;
                    }
                    x+=widthLogo+MORE_MARK_DISTANCE;
                }
            }else{
                graphics2d.drawImage(imageLogo, X, Y, null);
            }

            graphics2d.dispose();

            return  bufferedImage;
    }




    @Test
    public void testImageWaterMark() throws IOException {
        String originPath = "/Users/healerjean/Desktop/reduce.png";
        BufferedImage originImage = ImageIO.read(new File(originPath));


        String logoPath = "/Users/healerjean/Desktop/origin.jpeg";
        BufferedImage logoImage = ImageIO.read(new File(logoPath));

        BufferedImage newImage = imageWaterMark(originImage,logoImage,true);

        //存储到本地
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(newImage, saveFilePath);
    }


    /**
     *  9、解决图片红色问题 ，JDK中提供的Image
     //如果是file
     Image src=Toolkit.getDefaultToolkit().getImage(file.getPath());?

     如果是url
     URL url = new URL(wechat_erweimaTmail);
     java.awt.Image imageTookittitle = Toolkit.getDefaultToolkit().createImage(url);
     BufferedImage titleLab = ImageUtils.toBufferedImage(imageTookittitle);

     * @param image
     * @return
     */
    public static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        // This code ensures that all the pixels in the image are loaded
        image = new ImageIcon(image).getImage();
        BufferedImage bimage = null;
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        try {
            int transparency = Transparency.OPAQUE;
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();
            bimage = gc.createCompatibleImage(image.getWidth(null),
                    image.getHeight(null), transparency);
        } catch (HeadlessException e) {
            // The system does not have a screen
        }
        if (bimage == null) {
            // Create a buffered image using the default color model
            int type = BufferedImage.TYPE_INT_RGB;
            bimage = new BufferedImage(image.getWidth(null),
                    image.getHeight(null), type);
        }
        // Copy image to buffered image
        Graphics g = bimage.createGraphics();
        // Paint the image onto the buffered image
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bimage;
    }


    /**
     * 10、自己做图片 ，根据文本宽度进行换行
     */
    @Test
    public void creatMyImage(){

        //整体图合成
        BufferedImage bufferedImage = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        //设置图片的背景色
        Graphics2D main = bufferedImage.createGraphics();
        main.fillRect(0, 0, 500, 500);

        String text = "111122223所以比传统纸巾更环保3334441比传统纸巾更环11111111111111122223所以比传统纸巾更环保3334441比传统纸巾更环11111111111111122223所以比传统纸巾更环保3334441比传统纸巾更环11111111111111122223所以比传统纸巾更环保3334441比传统纸巾更环11111111111";

        Graphics2D textG = bufferedImage.createGraphics() ;

        textG.setColor(new Color(37,37,37));
        Font hualaoContentFont = new Font("PingFang SC", Font.PLAIN, 20);
        textG.setFont(hualaoContentFont);
        textG.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        drawString(textG,text,30,100,4,10,50,true,false);

        //存储到本地
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(bufferedImage, saveFilePath);

    }


    /**
     *
     * @param g
     * @param text 文本
     * @param lineHeight 行高（注意字体大小的控制哦）
     * @param maxWidth 行宽
     * @param maxLine 最大行数
     * @param left 左边距 //整段文字的左边距
     * @param top 上边距 //整顿文字的上边距
     * @param trim 是否修剪文本（1、去除首尾空格，2、将多个换行符替换为一个）
     * @param lineIndent 是否首行缩进
     */
    public static void drawString(Graphics2D g, String text, float lineHeight, float maxWidth, int maxLine, float left,
                                  float top, boolean trim, boolean lineIndent) {
        if (text == null || text.length() == 0) return;
        if(trim) {
            text = text.replaceAll("\\n+", "\n").trim();
        }
        if(lineIndent) {
            text = "　　" + text.replaceAll("\\n", "\n　　");
        }
        drawString(g, text, lineHeight, maxWidth, maxLine, left, top);
    }

    /**
     *
     * @param g
     * @param text 文本
     * @param lineHeight 行高
     * @param maxWidth 行宽
     * @param maxLine 最大行数
     * @param left 左边距
     * @param top 上边距
     */
    private static void drawString(Graphics2D g, String text, float lineHeight, float maxWidth, int maxLine, float left,
                                   float top) {
        if (text == null || text.length() == 0) return;

        FontMetrics fm = g.getFontMetrics();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            sb.append(c);
            int stringWidth = fm.stringWidth(sb.toString());
            if (c == '\n' || stringWidth > maxWidth) {
                if(c == '\n') {
                    i += 1;
                }
                if (maxLine > 1) {
                    g.drawString(text.substring(0, i), left, top);
                    drawString(g, text.substring(i), lineHeight, maxWidth, maxLine - 1, left, top + lineHeight);
                } else {
                    g.drawString(text.substring(0, i - 1) + "…", left, top);
                }
                return;
            }
        }
        g.drawString(text, left, top);
    }


}
