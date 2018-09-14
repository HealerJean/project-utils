package com.hlj.util.QRcode;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/7/3  ����4:41.
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

import javax.imageio.ImageIO;


public class ReduceImgTest {
    /**
     * ָ��ͼƬ��Ⱥ͸߶Ⱥ�ѹ��������ͼƬ����ѹ��
     *
     * @param widthdist
     *            ѹ����ͼƬ�Ŀ��
     * @param heightdist
     *            ѹ����ͼƬ�ĸ߶�
     * @param rate
     *            ѹ���ı���
     */
    public static BufferedImage reduceImg(BufferedImage bufferedImage, int widthdist, int heightdist, Float rate) {
        try {

            // ���������Ϊ����˵���ǰ�����ѹ��
            if (rate != null && rate > 0) {
                //���ԴͼƬ�Ŀ�ߴ���������
                int[] results = getImgWidthHeight(bufferedImage);
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
     * ��ȡͼƬ��Ⱥ͸߶�
     *
     * @return ����ͼƬ�Ŀ��
     */
    public static int[] getImgWidthHeight(BufferedImage bufferedImage) {
        int result[] = { 0, 0 };
        try {
            // ����ļ�������
            // �����ｫͼƬд�뻺��ͼƬ��
            result[0] =bufferedImage.getWidth(null); // �õ�ԴͼƬ��
            result[1] =bufferedImage.getHeight(null);// �õ�ԴͼƬ��
        } catch (Exception ef) {
            ef.printStackTrace();
        }

        return result;
    }

    public static BufferedImage getBufferedImageByUrl(String url, int width,int heigth) throws IOException {


        URL u = new URL(url);
        BufferedImage imageQR = ImageIO.read(u);
        BufferedImage bufferedImage =  reduceImg(imageQR, width, width, null);
        return  bufferedImage;
    }
}
