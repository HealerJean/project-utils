package com.hlj.util.QRcode;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.junit.Test;

public class QRCodeUtils {

    // 二维码宽度
    private static Integer WIDTH_PIX = 300;

    // 二维码高度
    private static Integer HEIGHT_PIX = 300;

    // 生成文件类型
    private static String TYPE = "png";

    // 编码格式
    private static String CHAR_TYPE = "UTF-8";

    /** 二维码填充颜色 BEGIN*/
    // 黑色
    private static Integer COLOR_BLACK = 0XFF000000;
    // 白色 0xFF是补码
    private static Integer COLOR_WHITE = 0XFFFFFFFF;
    // 红色
    private static Integer COLOR_RED = 0xFFFF0000;
    // 蓝色 ,0xFF  #FFD700
    private static Integer COLOR_BLUE = 0xFFFFD700;
    /** 二维码填充颜色 END*/

    /**字体设定 BEGIN*/
    //设定写在二维码上的字体 样式
    private static String FONT_NAME = "Consolas";

    //字体颜色
    private static Color FONT_COLOR =  Color.gray;

    //字体 大小
    private static Integer FONT_SIZE =12;
    /**字体设定 END*/


    /**
     * 读取二维码的文件里面的信息
     *
     * @param filePath
     * @return
     * @throws Exception
     */
    public static String readQRImg(String filePath) throws Exception {
        // 读取图片
        BufferedImage image = ImageIO.read(new File(filePath));

        LuminanceSource source = new BufferedImageLuminanceSource(image);
        Binarizer binarizer = new HybridBinarizer(source);
        BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
        Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
        hints.put(DecodeHintType.CHARACTER_SET, CHAR_TYPE);
        Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码

        return result.getText();

    }

    /**
     * 通过BufferedImage 来写入图片的操作,没有用到Google 的j2se包
     *
     * @param text
     *            写入的信息
     * @param filePath
     *            输出的文件地址
     * @return
     * @throws Exception
     */
    public static File writeQRImg(String text, String filePath,String... logoPath) throws Exception {
        // 配置参数
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // 字符编码
        hints.put(EncodeHintType.CHARACTER_SET, CHAR_TYPE);

        // 容错级别
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // 设置空白边距的宽度
        hints.put(EncodeHintType.MARGIN, 3); // 默认是4

        // 1、生成二维码
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, WIDTH_PIX, HEIGHT_PIX, hints);

        // 2、获取二维码宽高
        int codeWidth = bitMatrix.getWidth();
        int codeHeight = bitMatrix.getHeight();

        // 3、将二维码放入缓冲流
        BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < codeWidth; i++) {
            for (int j = 0; j < codeHeight; j++) {
                // 4、循环将二维码内容定入图片
                //判断 BitMatrix 是否存在像素
                image.setRGB(i, j, bitMatrix.get(i, j) ? COLOR_BLACK : COLOR_WHITE);
            }
        }

        //判断是否写入logo图片
        if(logoPath != null && logoPath.length>0){
            File logoPic = new File(logoPath[0]);
            if (logoPic.exists()) {
                //在原来基础上，再添加一个图片
                Graphics2D g = image.createGraphics();
                BufferedImage logo = ImageIO.read(logoPic);
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


                //最后一个参数用来设置字体的大小
                Font fontStyle = new Font(FONT_NAME,Font.PLAIN,FONT_SIZE);

                //设定颜色
                g.setColor(FONT_COLOR); //设定颜色
                g.setFont(fontStyle); //设定字体
                Integer fontStartIndex = image.getWidth()-(int) (text.length()*FONT_SIZE*0.7);
                g.drawString(text,fontStartIndex,image.getHeight()-FONT_SIZE);

                //释放图像资源
                g.dispose();
                logo.flush();
                image.flush();
            }
        }

        // 获取输出的图片
        File outPutImage = getQRImgFile(filePath);
        // 5、将二维码写入图片
        ImageIO.write(image, TYPE, outPutImage);

        return outPutImage;
    }

    /**
     * 获取二维码图片
     *
     * 图片写出的路径比如 C:/ 或者 D:/test/xx
     * @return
     * @throws Exception
     */
    private static File getQRImgFile(String filePath) throws Exception {
        // 获取图片名称
        String fileName = UUID.randomUUID().toString() + "." + TYPE;
        File outPutImage = new File(filePath + File.separator + fileName);

        // 如果图片不存在创建图片
        if (!outPutImage.exists()) {
            outPutImage.createNewFile();
        }
        return outPutImage;
    }

    /**
     * 创建二维码，通过BitMatrix 这个类来生成二维码<br/>
     * 用到了gooogle的j2se的包
     *
     * @param text
     *            需要写入的信息，是json数据类型.也可以是 http://yellowcong.com 等
     * @param filePath
     *            数据的文件地址路径
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
    public static File writeQRImg4J2se(String text, String filePath) throws Exception {

        // 配置参数
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // 字符编码
        hints.put(EncodeHintType.CHARACTER_SET, CHAR_TYPE);

        // 容错级别
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // 设置空白边距的宽度
        hints.put(EncodeHintType.MARGIN, 3); // 默认是4

        // 图像数据转换，使用了矩阵转换 ，这种方法适合在Android机器上使用
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, WIDTH_PIX, HEIGHT_PIX, hints);

        // 获取输出的图片
        File outPutImage = getQRImgFile(filePath);

        // 写出成文件，设置文件地址
        // 这个是google j2se 这个包里面的api
        MatrixToImageWriter.writeToFile(bitMatrix, TYPE, outPutImage);

        return outPutImage;
    }


    /**
     * 不带logo的二维码
     * @throws Exception
     */
    @Test
    public void testWriteQRImg() throws Exception{
        String outPath = "/Users/healerjean/Desktop";
        QRCodeUtils.writeQRImg("http://blog.healerjean.top", outPath);
    }

    /**
     * 带logo的二维码
     * @throws Exception
     */
    @Test
    public void testWriteQRImgWithLogo() throws Exception{
        String logoPath = "/Users/healerjean/Desktop/duodianyouhuilogo.png";
        String outPath = "/Users/healerjean/Desktop";
        QRCodeUtils.writeQRImg("http://test.dangqugame.cn/duodian/youhui/redirectTaoKouLing?taokouling=￥3hxo0EfH68X￥", outPath,logoPath);
    }

    /**
     * 读取二维码信息
     * @throws Exception
     */
    @Test
    public void testReadQRImg() throws Exception{
        //读取二维码信息
        String info =QRCodeUtils.readQRImg("/Users/healerjean/Desktop/2a4342be-0375-4a10-86e0-a4ab1a8f5313.png");
        System.out.println(info);
    }


}