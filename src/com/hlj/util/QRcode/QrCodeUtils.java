package com.hlj.util.QRcode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.junit.Test;

import javax.imageio.ImageIO;
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
public class QrCodeUtils {


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
            buffImg = imageAndImages(ImageIO.read(new File(sourceFilePath)), ImageIO.read(new File(innerImageFilePath)),238, 588,210 ,208, 1.0f);
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
        BufferedImage  noLogoImage = writeQRImg(text,200,200, 4 );
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







}
