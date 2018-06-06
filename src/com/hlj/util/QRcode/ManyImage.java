package com.hlj.util.QRcode;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class ManyImage {
    /**
     *
     * @Title: ����ͼƬ
     * @Description: ����ˮӡ������java.awt.image.BufferedImage
     * @param file
     *            Դ�ļ�(ͼƬ)
     * @param waterFile
     *            ˮӡ�ļ�(ͼƬ)
     * @param x
     *            �������½ǵ�Xƫ����
     * @param y
     *            �������½ǵ�Yƫ����
     * @param alpha
     *            ͸����, ѡ��ֵ��0.0~1.0: ��ȫ͸��~��ȫ��͸��
     * @return BufferedImage
     * @throws IOException
     */
    public static BufferedImage watermark(File file, File waterFile, int x, int y, float alpha) throws IOException {
        // ��ȡ��ͼ
        BufferedImage buffImg = ImageIO.read(file);
        // ��ȡ��ͼ
        BufferedImage waterImg = ImageIO.read(waterFile);
        // ����Graphics2D�������ڵ�ͼ�����ϻ�ͼ
        Graphics2D g2d = buffImg.createGraphics();
        int waterImgWidth = waterImg.getWidth();// ��ȡ��ͼ�Ŀ��
        int waterImgHeight = waterImg.getHeight();// ��ȡ��ͼ�ĸ߶�
        // ��ͼ�κ�ͼ����ʵ�ֻ�Ϻ�͸��Ч��
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
        // ����
        g2d.drawImage(waterImg, x, y, waterImgWidth, waterImgHeight, null);
        g2d.dispose();// �ͷ�ͼ��������ʹ�õ�ϵͳ��Դ
        return buffImg;
    }

    /**
     * ���ˮӡͼƬ
     *
     * @param buffImg
     *            ͼ���ˮӡ֮���BufferedImage����
     * @param savePath
     *            ͼ���ˮӡ֮��ı���·��
     */
    private void generateWaterFile(BufferedImage buffImg, String savePath) {
        int temp = savePath.lastIndexOf(".") + 1;
        try {
            ImageIO.write(buffImg, savePath.substring(temp), new File(savePath));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    /**
     *
     * @param args
     * @throws IOException
     *             IO�쳣ֱ���׳���
     * @author bls
     */
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "/Users/healerjean/Desktop/WechatIMG155.jpeg";
        String waterFilePath = "/Users/healerjean/Desktop/erweima.png";
        String saveFilePath = "/Users/healerjean/Desktop/new.png";
        ManyImage newImageUtils = new ManyImage();
        // �������Ӳ�
        BufferedImage buffImg = ManyImage.watermark(new File(sourceFilePath), new File(waterFilePath), 570, 980, 1.0f);
        // ���ˮӡͼƬ
        newImageUtils.generateWaterFile(buffImg, saveFilePath);
    }
}