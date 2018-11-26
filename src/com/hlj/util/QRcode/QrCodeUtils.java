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
 * ���� ��HealerJean
 * ���� ��2018/10/29  ����4:31.
 * ��������
 */
public class QrCodeUtils {


    /**
     *
     * 1�� ���ͼƬ������Ŀ¼
     * @param buffImg ͼƬ
     * @param savePath ����Ŀ¼��·��
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
     * 2�� ��������: ���ͼƬ�ϳ�
     * exImage ��ͼ
     * innerImage Ƕ���ͼƬ
     * x ����x
     * y ����y
     * innerImageWedith Ƕ��ͼƬ�ĳ���
     * innerImageHeight Ƕ��ͼƬ�Ŀ��
     */
    public  static BufferedImage imageAndImages(BufferedImage exImage, BufferedImage innerImage, int x, int y, int innerImageWedith, int innerImageHeight, float alpha) throws IOException {
        Graphics2D g2d = exImage.createGraphics();
        // ��ͼ�κ�ͼ����ʵ�ֻ�Ϻ�͸��Ч��
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
        // ����
        g2d.drawImage(innerImage, x, y, innerImageWedith, innerImageHeight, null);
        g2d.dispose();// �ͷ�ͼ��������ʹ�õ�ϵͳ��Դ
        return exImage;
    }

    /**
     * 2������ ���ͼƬ�ϳ�
     */
    @Test
    public void testimageAndImages(){

        String sourceFilePath = "/Users/healerjean/Desktop/origin.jpeg";
        String innerImageFilePath = "/Users/healerjean/Desktop/img.jpeg";
        // �������Ӳ�
        BufferedImage buffImg = null;
        try {
            buffImg = imageAndImages(ImageIO.read(new File(sourceFilePath)), ImageIO.read(new File(innerImageFilePath)),595, 1000,245 ,245, 1.0f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ���ˮӡͼƬ
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(buffImg, saveFilePath);
    }


    /**
     * 3������logo�Ķ�ά��
     *
     * @param text ��ά������
     * @param width ��ά����
     * @param height ����
     * @param whiteSize �ױߴ�С
     * @return
     */
    public static BufferedImage writeQRImg(String text,int width,int height,int whiteSize){
        // ���ò���
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // �ַ�����
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        // �ݴ���
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // ���ÿհױ߾�Ŀ��
        hints.put(EncodeHintType.MARGIN, whiteSize); // Ĭ����4

        // 1�����ɶ�ά��
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        // 2����ȡ��ά����
        int codeWidth = bitMatrix.getWidth();
        int codeHeight = bitMatrix.getHeight();

        // 3������ά����뻺����
        BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < codeWidth; i++) {
            for (int j = 0; j < codeHeight; j++) {
                // 4��ѭ������ά�����ݶ���ͼƬ
                //�ж� BitMatrix �Ƿ��������  ��ά�������ɫ ��ɫ  0XFF000000 ��ɫ ��0xFF�ǲ��� 0XFFFFFFFF
                image.setRGB(i, j, bitMatrix.get(i, j) ? 0XFF000000 : 0XFFFFFFFF);
            }
        }

        return image ;
    }

    /**
     * 3������ ����logo�Ķ�ά��
     * @throws Exception
     */
    @Test
    public void testWriteQRImg(){
        String text = "http://blog.healerjean.top";
        BufferedImage  noLogoImage = writeQRImg(text,200,200, 0 );
        //�洢������
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(noLogoImage, saveFilePath);
    }





    /**
     *  4�� ��ȡ��ά����ļ��������Ϣ
     */
    public static String readQRImg(BufferedImage image) throws Exception {

        LuminanceSource source = new BufferedImageLuminanceSource(image);
        Binarizer binarizer = new HybridBinarizer(source);
        BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
        Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
        // �ַ�����
        hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
        Result result = new MultiFormatReader().decode(binaryBitmap, hints);// ��ͼ����н���
        return result.getText();
    }

    /**
     * 4������ ��ȡ��ά����Ϣ
     * @throws Exception
     */
    @Test
    public void testReadQRImg() throws Exception{
        //��ȡ��ά����Ϣ
        String filePath = "/Users/healerjean/Desktop/new.png";
        BufferedImage image = ImageIO.read(new File(filePath));
        String info =readQRImg(image);
        System.out.println(info);
    }



    /**
     *   5�� ���ɴ�logo�Ķ�ά��
     *
     *
     * @param text ��ά������
     * @param text ��ά������
     * @param width ��ά����
     * @param height ����
     * @param whiteSize �ױߴ�С
     * @param logo LOGOͼƬ
     * @return
     * @throws Exception
     */
    public static BufferedImage createLogoQRImg(String text,int width,int height, int whiteSize,BufferedImage logo) throws Exception {
        // ���ò���
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // �ַ�����
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        // �ݴ���
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // ���ÿհױ߾�Ŀ��
        hints.put(EncodeHintType.MARGIN, whiteSize); // Ĭ����4

        // 1�����ɶ�ά��
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        // 2����ȡ��ά����
        int codeWidth = bitMatrix.getWidth();
        int codeHeight = bitMatrix.getHeight();

        // 3������ά����뻺����
        BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < codeWidth; i++) {
            for (int j = 0; j < codeHeight; j++) {
                // 4��ѭ������ά�����ݶ���ͼƬ
                //�ж� BitMatrix �Ƿ��������  ��ά�������ɫ ��ɫ  0XFF000000 ��ɫ ��0xFF�ǲ��� 0XFFFFFFFF
                image.setRGB(i, j, bitMatrix.get(i, j) ? 0XFF000000 : 0XFFFFFFFF);
            }
        }

            //��ԭ�������ϣ������һ��ͼƬ
            Graphics2D g = image.createGraphics();
            int widthLogo = logo.getWidth(null) > image.getWidth() * 2 / 10 ?
                    (image.getWidth() * 2 / 10) : logo.getWidth(null);
            int heightLogo = logo.getHeight(null) > image.getHeight() * 2 / 10 ?
                    (image.getHeight() * 2 / 10) : logo.getHeight(null);

            //�趨��ͼƬ�м�
            int x = (image.getWidth() - widthLogo) / 2;
            int y = (image.getHeight() - heightLogo) / 2;

            // ��ʼ����ͼƬ
            g.drawImage(logo, x, y, widthLogo, heightLogo, null);

            //����Բ�Ǿ���
            g.drawRoundRect(x, y, widthLogo, heightLogo, 15, 15);

            //�߿���
            g.setStroke(new BasicStroke(2));

            //�߿���ɫ
            g.setColor(Color.WHITE);
            g.drawRect(x, y, widthLogo, heightLogo);

            g.dispose();
            logo.flush();
            image.flush();
            return image;
    }




    /**
     * 5������ ��logo�Ķ�ά��
     * @throws Exception
     */
    @Test
    public void testWriteQRImgWithLogo() throws Exception{
        String text = "http://blog.healerjean.top";
        String logoPath = "/Users/healerjean/Desktop/logo.png";
        BufferedImage logo = ImageIO.read(new File(logoPath));
        BufferedImage  logoImage = createLogoQRImg(text,200,200, 1 ,logo);

        //�洢������
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(logoImage, saveFilePath);
    }


    /**
     * 6/ ָ��ͼƬ��Ⱥ͸߶Ⱥ�ѹ��������ͼƬ����ѹ��
     * @param widthdist ѹ����ͼƬ�Ŀ��
     * @param heightdist ѹ����ͼƬ�ĸ߶�
     * @param rate ѹ���ı��� ,��������Ϊnull
     */
    public static BufferedImage reduceImg(BufferedImage bufferedImage, int widthdist, int heightdist, Float rate) {
        try {

            // ���������Ϊ����˵���ǰ�����ѹ��
            if (rate != null && rate > 0) {
                //���ԴͼƬ�Ŀ�ߴ���������
                int results[] = { 0, 0 };
                results[0] =bufferedImage.getWidth(null); // �õ�ԴͼƬ��
                results[1] =bufferedImage.getHeight(null);// �õ�ԴͼƬ��

                if (results == null || results[0] == 0 || results[1] == 0) {
                    return null;
                } else {
                    //���������Ż�����ͼƬ��С����������תΪ����
                    widthdist = (int) (results[0] * rate);
                    heightdist = (int) (results[1] * rate);
                }
            }
            // ��ʼ��ȡ�ļ�������ѹ��
            Image src = (Image) bufferedImage;
            // ����һ������ΪԤ����ͼ������֮һ�� BufferedImage
            BufferedImage tag = new BufferedImage((int) widthdist, (int) heightdist, BufferedImage.TYPE_INT_RGB);
            //����ͼ��  getScaledInstance��ʾ������ͼ������Ű汾������һ���µ����Ű汾Image,��ָ����width,height����ͼ��
            //Image.SCALE_SMOOTH,ѡ��ͼ��ƽ���ȱ������ٶȾ��и������ȼ���ͼ�������㷨��
            tag.getGraphics().drawImage(src.getScaledInstance(widthdist, heightdist, Image.SCALE_SMOOTH), 0, 0, null);

            return tag;
        } catch (Exception ef) {
            ef.printStackTrace();
        }
        return  null;
    }

    /**
     * 6 ����
     * @throws IOException
     */
    @Test
    public void testReduceImg() throws IOException {
        String reducePath = "/Users/healerjean/Desktop/reduce.png";
        BufferedImage originImage = ImageIO.read(new File(reducePath));
        BufferedImage  reduceImg = reduceImg(originImage,200,200, null );

        //�洢������
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(reduceImg, saveFilePath);
    }


    /**
     *  7�� �������ˮӡ
     * @param image ��Ҫ��ˮӡ���ļ�
     * @param waterText ˮӡ�ı�
     * @param moreMark  �Ƿ��Ƕ��ˮӡ true���ˮӡ   /false ��д��һ��ˮӡ
     * @return
     */
    public static BufferedImage textWaterMark(BufferedImage image,String waterText, boolean... moreMark) {

            //������ʽ
            int FONT_STYLE = Font.BOLD;
            //�����С
            int FONT_SIZE = 50;
            //������ɫ
            Color FONT_COLOR = Color.black;
            //������ɫ
            String FONT_NAME = "΢���ź�";
            //͸����
            float ALPHA = 0.3F;

            //��ͼ������£�ˮӡ�ļ��
            Integer MORE_MARK_DISTANCE = 100;

            //����ԭʼͼƬ��ȳ���
            int width = image.getWidth();
            int height = image.getHeight();
            //����ͼƬ�������
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //����java��ͼ���߶���
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //������Ҫ�ǣ�ԭͼ�����꣬���
            graphics2d.drawImage(image, 0, 0, width, height, null);

            //ʹ�û�ͼ���߽�ˮӡ���Ƶ�ͼƬ��
            //��������ˮӡ���ֵ
            int waterWidth = FONT_SIZE*getTextLength(waterText);
            int waterHeight = FONT_SIZE;
            //ˮӡ͸������
            graphics2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ALPHA));
            graphics2d.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
            graphics2d.setColor(FONT_COLOR);

            if(moreMark!= null && moreMark.length >0 && moreMark[0]){
                //�趨��ת �� ��������������ʾ����Χ���Ǹ�����
                graphics2d.rotate(Math.toRadians(-30), bufferedImage.getWidth()/2, bufferedImage.getHeight()/2);

                int x = -width/2;
                int y = -height/2;

                while(x < width*1.5){
                    y = -height/2;
                    while(y < height*1.5){
                        graphics2d.drawString(waterText, x, y);
                        //ˮӡ�ļ��
                        y+=waterHeight+MORE_MARK_DISTANCE;
                    }
                    x+=waterWidth+MORE_MARK_DISTANCE;
                }
            }else{
                graphics2d.drawString(waterText, width-waterWidth, height);
            }

            //дͼƬ
            graphics2d.dispose();
            return  bufferedImage;
    }
    /**
     * ����ˮӡ�ı�����
     *
     * ���ĳ��ȼ��ı����� 2��Ӣ�ĳ���Ϊ�ı����ȶ���֮һ
     * @param text
     * @return
     */
    private static int getTextLength(String text){
        //ˮӡ���ֳ���
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

        //�洢������
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(newImage, saveFilePath);
    }





    /**
     * 8�� ���ͼƬˮӡ
     * @param
     * @return
     */
    public static BufferedImage imageWaterMark(BufferedImage image,BufferedImage imageLogo, boolean... moreMark) {
        //������ʽ
        int FONT_STYLE = Font.BOLD;
        //�����С
        int FONT_SIZE = 50;
        //������ɫ
        Color FONT_COLOR = Color.black;
        //������ɫ
        String FONT_NAME = "΢���ź�";
        //͸����
        float ALPHA = 0.3F;
        //��ͼ������£�ˮӡ�ļ��
        Integer MORE_MARK_DISTANCE = 100;

        int X = 636;
        int Y = 763;
            //����ԭʼͼƬ��ȳ���
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            //����ͼƬ�������
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //����java��ͼ���߶���
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //������Ҫ�ǣ�ԭͼ�����꣬���
            graphics2d.drawImage(image, 0, 0, width, height, null);
            graphics2d.setFont(new Font(FONT_NAME, FONT_STYLE, FONT_SIZE));
            graphics2d.setColor(FONT_COLOR);

            //ˮӡͼƬ·��
            int widthLogo = imageLogo.getWidth(null);
            int heightLogo = imageLogo.getHeight(null);
            int widthDiff = width-widthLogo;
            int heightDiff = height-heightLogo;
            //ˮӡ��������
            if (X > widthDiff) {
                X = widthDiff;
            }
            if (Y > heightDiff) {
                Y = heightDiff;
            }
            //ˮӡ͸������
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

        //�洢������
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        saveImageToLocalDir(newImage, saveFilePath);
    }


    /**
     *  9�����ͼƬ��ɫ���� ��JDK���ṩ��Image
     //�����file
     Image src=Toolkit.getDefaultToolkit().getImage(file.getPath());?

     �����url
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


}
