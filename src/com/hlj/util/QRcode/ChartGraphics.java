package com.hlj.util.QRcode;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;

public class ChartGraphics {
    private BufferedImage image;
    private int imageWidth = 900;  //ͼƬ�Ŀ��
    private int imageHeight = 1480; //ͼƬ�ĸ߶�
    //����ͼƬ�ļ�
    @SuppressWarnings("restriction")
    public void createImage(String fileLocation) {
        BufferedOutputStream bos = null;
        if(image != null){
            try {
                FileOutputStream fos = new FileOutputStream(fileLocation);
                bos = new BufferedOutputStream(fos);

                JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
                encoder.encode(image);
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                if(bos!=null){//�ر������
                    try {
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void graphicsGeneration(String name, String id, String classname, String imgurl) {
        int H_title = 30;     //ͷ���߶�
        int H_mainPic = 940;  //�ֲ����߶�
        int H_tip = 60;  //������ʾ��߶�
        int H_btn = 25;  //��ť���ĸ߶�
        int tip_2_top = (H_title+H_mainPic);
        int btns_2_top = tip_2_top+H_tip+20;
        int btn1_2_top = btns_2_top+10;
        int btn2_2_top = btn1_2_top+H_btn;
        int shops_2_top = btn2_2_top+H_btn+20;
        int W_btn = 280;  //��ť���Ŀ��

        image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        //����ͼƬ�ı���ɫ
        Graphics2D main = image.createGraphics();
        main.setColor(Color.white);
        main.fillRect(0, 0, imageWidth, imageHeight);

        //***********************ҳ��ͷ��
        Graphics title = image.createGraphics();
        //����������ɫ
        title.setColor(new Color(143, 0, 0));
        //�������ȷ�������Сλ��
        title.fillRect(0, 0, imageWidth, H_title);
        //����������ɫ����������ɫ�����������
        title.setColor(Color.white);
        //��������
        Font titleFont = new Font("����", Font.BOLD, 14);
        title.setFont(titleFont);
        title.drawString("my head", 100, (H_title)/2+5);

        //***********************�����м���ͼ
        Graphics mainPic = image.getGraphics();
        BufferedImage bimg = null;
        try {
            bimg = javax.imageio.ImageIO.read(new java.io.File(imgurl));
        } catch (Exception e) {}

        if(bimg!=null){
            mainPic.drawImage(bimg, 0, H_title, imageWidth, H_mainPic, null);
            mainPic.dispose();
        }
        //***********************�����������ʾ��

        Graphics2D tip = image.createGraphics();
        //����������ɫ
        tip.setColor(new Color(255, 120, 89));
        //�������ȷ�������Сλ��
        tip.fillRect(0, tip_2_top, imageWidth, H_tip);
        //����������ɫ����������ɫ�����������
        tip.setColor(Color.white);
        //��������
        Font tipFont = new Font("����", Font.PLAIN, 14);
        tip.setFont(tipFont);
        tip.drawString("��¼�ɹ���������֤ʱ��1Сʱ", 60, tip_2_top+(H_tip)/2-10);
        tip.drawString("���ڷ����̼���ҳ", 100, tip_2_top+(H_tip)/2+10);



        //***********************��������İ�ť��
        //����������ɫ����������ɫ�����������
        tip.setColor(Color.black);
        tip.drawString("������ѡ��Ĳ�����", 20, btns_2_top);
        tip.drawString("�����Сͼ�꣺", 20, shops_2_top);
        //***********************��ť
        Font btnFont = new Font("����", Font.BOLD, 14);
        Graphics2D btn1 = image.createGraphics();
        btn1.setColor(new Color(41,192 , 50));//#29C65A
        btn1.fillRect(10, btn1_2_top, W_btn, H_btn);
        btn1.setColor(Color.BLACK);
        btn1.drawRect(10, btn1_2_top, W_btn, H_btn);
        //btn1 �ı�
        btn1.setColor(Color.white);
        btn1.setFont(btnFont);
        btn1.drawString("�����Ұ�", 120, btn1_2_top+(H_btn/2)+5);

        Graphics2D btn2 = image.createGraphics();
        btn2.setColor(new Color(141,120 , 22));//#29C65A
        btn2.fillRect(10, btn2_2_top, W_btn, H_btn);
        btn2.setColor(Color.BLACK);
        btn2.drawRect(10, btn2_2_top, W_btn, H_btn);
        //btn2�ı�
        btn2.setColor(Color.white);
        btn2.setFont(btnFont);
        btn2.drawString("�����Ұ�", 120, btn2_2_top+(H_btn/2)+5);

        createImage("/Users/healerjean/Desktop/newChartGraphics.png");

    }

//    public static void main(String[] args) {
//        ChartGraphics cg = new ChartGraphics();
//        try {
//            cg.graphicsGeneration("ewew", "1", "12", "/Users/healerjean/Desktop/WechatIMG155.jpeg");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


      public static List<String> getStrList(String inputString, int length) {
            int size = inputString.length() / length;
            if (inputString.length() % length != 0) {
                size += 1;
            }
            return getStrList(inputString, length, size);
        }


     public static List<String> getStrList(String inputString, int length,
                int size) {
            List<String> list = new ArrayList<String>();
            for (int index = 0; index < size; index++) {
                String childStr = substring(inputString, index * length,
                        (index + 1) * length);
                list.add(childStr);
            }
            return list;
        }


    public static String substring(String str, int f, int t) {
        if (f > str.length())
            return null;
        if (t > str.length()) {
            return str.substring(f, str.length());
        } else {
            return str.substring(f, t);
        }
    }



    public static BufferedImage graphicsGenerationlovely(BufferedImage imageQR,  BufferedImage ImageerWeiMa) {
        //����ͼ�ĸ߶ȺͿ��
        int lovelyImageWidth = 900;
        int lovelyImageHeight = 1428;
        //����ͼ�ϳ�
        BufferedImage bufferedImage = new BufferedImage(lovelyImageWidth, lovelyImageHeight, BufferedImage.TYPE_INT_RGB);
        //����ͼƬ�ı���ɫ
        Graphics2D main = bufferedImage.createGraphics();
        main.fillRect(0, 0, lovelyImageWidth, lovelyImageHeight);


        Graphics graphicsQR = bufferedImage.getGraphics();
        graphicsQR.drawImage(imageQR, 0, 0, 900, 940, null);
        graphicsQR.drawImage(ImageerWeiMa, 591, 992, 249, 249, null);





        Graphics2D baoyou = bufferedImage.createGraphics();
        baoyou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        baoyou.setColor(new Color(218, 83, 80));
        baoyou.fillRect(25,985,60,30);
        //�̶����� ����
        Graphics2D fixBaoyou = bufferedImage.createGraphics();
        fixBaoyou.setColor(new Color(252, 250, 253));
        Font baoyouFont = new Font("����", Font.PLAIN, 26);
        fixBaoyou.setFont(baoyouFont);
        fixBaoyou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixBaoyou.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String baoyouWenzi =  "����";
        fixBaoyou.drawString(baoyouWenzi, 25, 1010);



        //�̶����� title
        Graphics2D fixed = bufferedImage.createGraphics();
        fixed.setColor(new Color(51, 51, 51));
        Font fixedFont = new Font("����", Font.PLAIN, 37);
        fixed.setFont(fixedFont);
        //ʧ�洦��
        fixed.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixed.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String title =  "�������ƻ��1/7p/X���������ת��ͷ";

        List<String> list = getStrList(title,14);

        int i = 1 ;
        for(String str:list){
            if(i==1){
                fixed.drawString(str, 95, 1010);
            }else if(i==2){
                fixed.drawString(str, 20, 1055);
            }else if(i ==3){
                fixed.drawString(str, 20, 1095);
            }
            i++;
        }


        //�̶����� �ּ�
        Graphics2D fixNowPrice = bufferedImage.createGraphics();
        fixNowPrice.setColor(new Color(51, 51, 51));
        Font fixNowPriceFont = new Font("����", Font.PLAIN, 28);
        fixNowPrice.setFont(fixNowPriceFont);
        //ʧ�洦��
        fixNowPrice.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixNowPrice.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String newPrice =  "�ּۣ���39.90";
        fixNowPrice.drawString(newPrice, 25, 1166);


        Graphics2D quanJx = bufferedImage.createGraphics();
        quanJx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        quanJx.setColor(new Color(218, 83, 80));
        quanJx.fillRect(25,1190,30,30);


        //�̶����� ȯ
        Graphics2D fixquanWenzi = bufferedImage.createGraphics();
        fixquanWenzi.setColor(new Color(252, 250, 253));
        Font fixQuanHouwenziFont = new Font("����", Font.PLAIN, 26);
        fixquanWenzi.setFont(fixQuanHouwenziFont);
        //ʧ�洦��
        fixquanWenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixquanWenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String quanwezi =  "ȯ";
        fixquanWenzi.drawString(quanwezi, 25, 1215);



        Graphics2D yuanJx = bufferedImage.createGraphics();
        yuanJx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        yuanJx.setColor(new Color(218, 83, 80));
        yuanJx.drawRect(55,1190,60,30);


        //�̶����� ȯ
        Graphics2D fixyuanWenzi = bufferedImage.createGraphics();
        fixyuanWenzi.setColor(new Color(218, 83, 80));
        Font fixyuanWenziFont = new Font("����", Font.PLAIN, 26);
        fixyuanWenzi.setFont(fixyuanWenziFont);
        //ʧ�洦��
        fixyuanWenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixyuanWenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String yuan =  "30Ԫ";
        fixyuanWenzi.drawString(yuan, 55, 1215);




        //�̶����� ȯ�Լ�ȯ���
        Graphics2D fixQuanHou = bufferedImage.createGraphics();
        fixQuanHou.setColor(new Color(51, 51, 51));
        Font fixQuanHouFont = new Font("����", Font.PLAIN, 26);
        fixQuanHou.setFont(fixQuanHouFont);
        //ʧ�洦��
        fixQuanHou.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixQuanHou.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String quanhoujia =  "ȯ���:";
        fixQuanHou.drawString(quanhoujia, 131, 1215);




        //�̶����֣�
        Graphics2D meiyuan = bufferedImage.createGraphics();
        meiyuan.setColor(new Color(218, 83, 80));
        Font qhjPriceMeiyuanFont = new Font("����", Font.PLAIN, 30);
        meiyuan.setFont(qhjPriceMeiyuanFont);
        //ʧ�洦��
        meiyuan.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        meiyuan.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String meiyuanWenZi =  "��";
        meiyuan.drawString(meiyuanWenZi, 224, 1215);


        //�̶����� 9.90
        Graphics2D qhjPrice = bufferedImage.createGraphics();
        qhjPrice.setColor(new Color(218, 83, 80));
        Font qhjPriceFont = new Font("����", Font.PLAIN, 60);
        qhjPrice.setFont(qhjPriceFont);
        //ʧ�洦��
        qhjPrice.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        qhjPrice.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String QaunPrice =  "9.90";
        qhjPrice.drawString(QaunPrice, 245, 1215);




        Graphics2D sptjRect = bufferedImage.createGraphics();
        sptjRect.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        sptjRect.setColor(new Color(218, 83, 80));
        sptjRect.fillRect(25,1275,110,30);


        //�̶�����
        Graphics2D fixsptjwenzi = bufferedImage.createGraphics();
        fixsptjwenzi.setColor(new Color(252, 250, 253));
        Font sptjFont = new Font("����", Font.PLAIN, 26);
        fixsptjwenzi.setFont(sptjFont);
        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixsptjwenzi.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String sptjwenzi =  "��Ʒ�Ƽ�";
        fixsptjwenzi.drawString(sptjwenzi, 25, 1300);


        //��Ʒ�Ƽ�
        Graphics2D fixTuiJian = bufferedImage.createGraphics();
        fixTuiJian.setColor(new Color(51, 51, 51));
        Font fixTuiJianFont = new Font("����", Font.PLAIN, 30);
        fixTuiJian.setFont(fixTuiJianFont);
        //ʧ�洦��
        fixTuiJian.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        fixTuiJian.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        String tuijian =  "����Ʒ�ƣ�ҩ��Ʒ�ʡ���Ԥ�����������ߡ���Ѫ����������ֹѪ�����ư̺����������á�ʳ�÷�������Ϳ�˿ڣ���������ţ�̻�ˮ�����������������ζ����һ���Ѿ��������˷��ա���Ʒ���ϡ�ɨ�����桢ʮ���⳥��\n";

        List<String> tuijianList = getStrList(tuijian,24);

        int m = 1 ;
        for(String str:tuijianList){
            if(m ==1){
                fixTuiJian.drawString(str, 150, 1300);
            }else if(m ==2){
                fixTuiJian.drawString(str, 20, 1345);
            }else if(m  ==3){
                fixTuiJian.drawString(str, 20, 1390);
            }
            m++;
        }

        return bufferedImage;
    }

    public static void main(String[] args) throws IOException {
        //��Ҫ��ӵ�ͼƬ
        String imageQRUrl = "/Users/healerjean/Desktop/log.jpeg";
        //����ͼƬ��·��
        String result = "/Users/healerjean/Desktop/newgraphicsGenerationlovely.jpeg";
        FileInputStream inputStream = new FileInputStream(imageQRUrl);
        BufferedImage imageQR = ImageIO.read(inputStream);


        String imageErWeiMaUrl = "/Users/healerjean/Desktop/erweima.jpeg";
        FileInputStream  inputStreamErWeiMa= new FileInputStream(imageErWeiMaUrl);
        BufferedImage imageErWeiMa = ImageIO.read(inputStreamErWeiMa);


        BufferedImage bufferedImage = graphicsGenerationlovely(imageQR, imageErWeiMa);
        int temp = result.lastIndexOf(".") + 1;
        ImageIO.write(bufferedImage, result.substring(temp), new File(result));
    }
}