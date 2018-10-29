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
            buffImg = imageAndImages(ImageIO.read(new File(sourceFilePath)), ImageIO.read(new File(innerImageFilePath)),238, 588,210 ,208, 1.0f);
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
        BufferedImage  noLogoImage = writeQRImg(text,200,200, 4 );
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







}
