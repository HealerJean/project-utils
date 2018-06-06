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

    // ��ά����
    private static Integer WIDTH_PIX = 300;

    // ��ά��߶�
    private static Integer HEIGHT_PIX = 300;

    // �����ļ�����
    private static String TYPE = "png";

    // �����ʽ
    private static String CHAR_TYPE = "UTF-8";

    /** ��ά�������ɫ BEGIN*/
    // ��ɫ
    private static Integer COLOR_BLACK = 0XFF000000;
    // ��ɫ 0xFF�ǲ���
    private static Integer COLOR_WHITE = 0XFFFFFFFF;
    // ��ɫ
    private static Integer COLOR_RED = 0xFFFF0000;
    // ��ɫ ,0xFF  #FFD700
    private static Integer COLOR_BLUE = 0xFFFFD700;
    /** ��ά�������ɫ END*/

    /**�����趨 BEGIN*/
    //�趨д�ڶ�ά���ϵ����� ��ʽ
    private static String FONT_NAME = "Consolas";

    //������ɫ
    private static Color FONT_COLOR =  Color.gray;

    //���� ��С
    private static Integer FONT_SIZE =12;
    /**�����趨 END*/


    /**
     * ��ȡ��ά����ļ��������Ϣ
     *
     * @param filePath
     * @return
     * @throws Exception
     */
    public static String readQRImg(String filePath) throws Exception {
        // ��ȡͼƬ
        BufferedImage image = ImageIO.read(new File(filePath));

        LuminanceSource source = new BufferedImageLuminanceSource(image);
        Binarizer binarizer = new HybridBinarizer(source);
        BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
        Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
        hints.put(DecodeHintType.CHARACTER_SET, CHAR_TYPE);
        Result result = new MultiFormatReader().decode(binaryBitmap, hints);// ��ͼ����н���

        return result.getText();

    }

    /**
     * ͨ��BufferedImage ��д��ͼƬ�Ĳ���,û���õ�Google ��j2se��
     *
     * @param text
     *            д�����Ϣ
     * @param filePath
     *            ������ļ���ַ
     * @return
     * @throws Exception
     */
    public static File writeQRImg(String text, String filePath,String... logoPath) throws Exception {
        // ���ò���
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // �ַ�����
        hints.put(EncodeHintType.CHARACTER_SET, CHAR_TYPE);

        // �ݴ���
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // ���ÿհױ߾�Ŀ��
        hints.put(EncodeHintType.MARGIN, 3); // Ĭ����4

        // 1�����ɶ�ά��
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, WIDTH_PIX, HEIGHT_PIX, hints);

        // 2����ȡ��ά����
        int codeWidth = bitMatrix.getWidth();
        int codeHeight = bitMatrix.getHeight();

        // 3������ά����뻺����
        BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < codeWidth; i++) {
            for (int j = 0; j < codeHeight; j++) {
                // 4��ѭ������ά�����ݶ���ͼƬ
                //�ж� BitMatrix �Ƿ��������
                image.setRGB(i, j, bitMatrix.get(i, j) ? COLOR_BLACK : COLOR_WHITE);
            }
        }

        //�ж��Ƿ�д��logoͼƬ
        if(logoPath != null && logoPath.length>0){
            File logoPic = new File(logoPath[0]);
            if (logoPic.exists()) {
                //��ԭ�������ϣ������һ��ͼƬ
                Graphics2D g = image.createGraphics();
                BufferedImage logo = ImageIO.read(logoPic);
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


                //���һ������������������Ĵ�С
                Font fontStyle = new Font(FONT_NAME,Font.PLAIN,FONT_SIZE);

                //�趨��ɫ
                g.setColor(FONT_COLOR); //�趨��ɫ
                g.setFont(fontStyle); //�趨����
                Integer fontStartIndex = image.getWidth()-(int) (text.length()*FONT_SIZE*0.7);
                g.drawString(text,fontStartIndex,image.getHeight()-FONT_SIZE);

                //�ͷ�ͼ����Դ
                g.dispose();
                logo.flush();
                image.flush();
            }
        }

        // ��ȡ�����ͼƬ
        File outPutImage = getQRImgFile(filePath);
        // 5������ά��д��ͼƬ
        ImageIO.write(image, TYPE, outPutImage);

        return outPutImage;
    }

    /**
     * ��ȡ��ά��ͼƬ
     *
     * ͼƬд����·������ C:/ ���� D:/test/xx
     * @return
     * @throws Exception
     */
    private static File getQRImgFile(String filePath) throws Exception {
        // ��ȡͼƬ����
        String fileName = UUID.randomUUID().toString() + "." + TYPE;
        File outPutImage = new File(filePath + File.separator + fileName);

        // ���ͼƬ�����ڴ���ͼƬ
        if (!outPutImage.exists()) {
            outPutImage.createNewFile();
        }
        return outPutImage;
    }

    /**
     * ������ά�룬ͨ��BitMatrix ����������ɶ�ά��<br/>
     * �õ���gooogle��j2se�İ�
     *
     * @param text
     *            ��Ҫд�����Ϣ����json��������.Ҳ������ http://yellowcong.com ��
     * @param filePath
     *            ���ݵ��ļ���ַ·��
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
    public static File writeQRImg4J2se(String text, String filePath) throws Exception {

        // ���ò���
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // �ַ�����
        hints.put(EncodeHintType.CHARACTER_SET, CHAR_TYPE);

        // �ݴ���
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        // ���ÿհױ߾�Ŀ��
        hints.put(EncodeHintType.MARGIN, 3); // Ĭ����4

        // ͼ������ת����ʹ���˾���ת�� �����ַ����ʺ���Android������ʹ��
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, WIDTH_PIX, HEIGHT_PIX, hints);

        // ��ȡ�����ͼƬ
        File outPutImage = getQRImgFile(filePath);

        // д�����ļ��������ļ���ַ
        // �����google j2se ����������api
        MatrixToImageWriter.writeToFile(bitMatrix, TYPE, outPutImage);

        return outPutImage;
    }


    /**
     * ����logo�Ķ�ά��
     * @throws Exception
     */
    @Test
    public void testWriteQRImg() throws Exception{
        String outPath = "/Users/healerjean/Desktop";
        QRCodeUtils.writeQRImg("http://blog.healerjean.top", outPath);
    }

    /**
     * ��logo�Ķ�ά��
     * @throws Exception
     */
    @Test
    public void testWriteQRImgWithLogo() throws Exception{
        String logoPath = "/Users/healerjean/Desktop/duodianyouhuilogo.png";
        String outPath = "/Users/healerjean/Desktop";
        QRCodeUtils.writeQRImg("http://test.dangqugame.cn/duodian/youhui/redirectTaoKouLing?taokouling=��3hxo0EfH68X��", outPath,logoPath);
    }

    /**
     * ��ȡ��ά����Ϣ
     * @throws Exception
     */
    @Test
    public void testReadQRImg() throws Exception{
        //��ȡ��ά����Ϣ
        String info =QRCodeUtils.readQRImg("/Users/healerjean/Desktop/2a4342be-0375-4a10-86e0-a4ab1a8f5313.png");
        System.out.println(info);
    }


}