package com.hlj.util.QRcode;


import org.junit.Test;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

/**
 * ����ͼƬˮӡ����
 * @author yellowcong
 * @date 2017��9��16��
 */
public class WaterMarkUtils {

    //������ʽ
    private static final int FONT_STYLE = Font.BOLD;
    //�����С
    private static final int FONT_SIZE = 60;
    //������ɫ
    private static final Color FONT_COLOR = Color.black;
    //������ɫ
    private static final String FONT_NAME = "΢���ź�";
    //ͼƬ����
    private static final String IMAGE_TYPE  ="png";
    //͸����
    private static final float ALPHA = 0.3F;

    //��ͼ������£�ˮӡ�ļ��
    private static final Integer MORE_MARK_DISTANCE = 100;
    //ˮӡ����
    private static final String MARK_TEXT = "HealerJean�����벩��";
    //��ӡ�ĵط�
    private static final String OUT_PATH = "/Users/healerjean/Desktop";
    //ˮӡ���ļ�Ŀ¼
    private static final String LOGO_PATH = "/Usersfsdf/healerjean/Desktop/WX20180313-140701@2x.png";
    /**
     * ��ӵ�������ˮӡ
     * @param srcImg ��Ҫ��ˮӡ���ļ�
     * @param moreMark  �Ƿ��Ƕ��ˮӡ true���ˮӡ   /false ��д��һ��ˮӡ
     * @return
     */
    public static String textWaterMark(File srcImg,boolean... moreMark) {
        try {
            //��ȡͼƬ
            Image image = ImageIO.read(srcImg);

            //����ԭʼͼƬ��ȳ���
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            //����ͼƬ�������
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //����java��ͼ���߶���
            Graphics2D graphics2d = bufferedImage.createGraphics();
            //������Ҫ�ǣ�ԭͼ�����꣬���
            graphics2d.drawImage(image, 0, 0, width, height, null);

            //ʹ�û�ͼ���߽�ˮӡ���Ƶ�ͼƬ��
            //��������ˮӡ���ֵ
            int waterWidth = FONT_SIZE*getTextLength(MARK_TEXT);
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
                        graphics2d.drawString(MARK_TEXT, x, y);
                        //ˮӡ�ļ��
                        y+=waterHeight+MORE_MARK_DISTANCE;
                    }
                    x+=waterWidth+MORE_MARK_DISTANCE;
                }
            }else{
                graphics2d.drawString(MARK_TEXT, width-waterWidth, height);
            }

            //дͼƬ
            graphics2d.dispose();

            //��ȡ�����ͼƬ
            File outPutImage = WaterMarkUtils.getNewImgFile();

            // 5������ά��д��ͼƬ
            ImageIO.write(bufferedImage, IMAGE_TYPE, outPutImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * ����һ���µ��ļ�ͼƬ
     * @return
     * @throws Exception
     */
    private static File getNewImgFile()  {
        // ��ȡͼƬ����
        String fileName = UUID.randomUUID().toString() + "." + IMAGE_TYPE;
        File outPutImage = new File(OUT_PATH + File.separator + fileName);

        // ���ͼƬ�����ڴ���ͼƬ
        if (!outPutImage.exists()) {
            try {
                outPutImage.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return outPutImage;
    }

    /**
     * ��ӵ�ͼƬˮӡ
     * @param srcFile ��Ҫ��ˮӡ���ļ�·��
     * @return
     */
    public static String imageWaterMark(File srcFile,boolean... moreMark) {
        int X = 636;
        int Y = 763;

        try {
            Image image = ImageIO.read(srcFile);
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
            File logo = new File(LOGO_PATH);
            Image imageLogo = ImageIO.read(logo);
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

            //��ȡ�����ͼƬ
            File outPutImage = getNewImgFile();

            // 5������ά��д��ͼƬ
            ImageIO.write(bufferedImage, IMAGE_TYPE, outPutImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    //����ˮӡ�ı�����
    /**
     * 1�����ĳ��ȼ��ı����� 2��Ӣ�ĳ���Ϊ�ı����ȶ���֮һ
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


    /**
     * 1�����Ե���ˮӡ�Ĳ���
     */
    @Test
    public void testWarterCode(){
        //Ҫˮӡ���ļ�
        String file =  "/Users/healerjean/Desktop/WX20180313-140701@2x.png";
        //��ʾֻдһ��ˮӡ�Ĳ���
        WaterMarkUtils.textWaterMark(new File(file));


    }

    /**
     * 2����Ӷ������ˮӡ HealerJean�����벩��
     */
    @Test
    public void testMoreTextWaterMark() throws Exception{
        String file = "C:/Users/yellowcong/Desktop/qr/logo/logo.jpg";
        WaterMarkUtils.textWaterMark(new File(file),true);
    }


    @Test
    public void testImageWaterMark() throws Exception{
        String file = "C:/Users/yellowcong/Desktop/qr/logo/logo.jpg";
        WaterMarkUtils.imageWaterMark(new File(file));
    }

    /**
     * ��ˮӡͼƬ����
     * @throws Exception
     */
    @Test
    public void testMoreImageWaterMark() throws Exception{
        String file = "C:/Users/yellowcong/Desktop/qr/logo/logo.jpg";
        WaterMarkUtils.imageWaterMark(new File(file),true);
    }

}