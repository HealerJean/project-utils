package com.hlj.util.QRcode;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/7/3  下午4:41.
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

import javax.imageio.ImageIO;


public class ReduceImgTest {
    /**
     * 指定图片宽度和高度和压缩比例对图片进行压缩
     *
     * @param widthdist
     *            压缩后图片的宽度
     * @param heightdist
     *            压缩后图片的高度
     * @param rate
     *            压缩的比例
     */
    public static BufferedImage reduceImg(BufferedImage bufferedImage, int widthdist, int heightdist, Float rate) {
        try {

            // 如果比例不为空则说明是按比例压缩
            if (rate != null && rate > 0) {
                //获得源图片的宽高存入数组中
                int[] results = getImgWidthHeight(bufferedImage);
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
     * 获取图片宽度和高度
     *
     * @return 返回图片的宽度
     */
    public static int[] getImgWidthHeight(BufferedImage bufferedImage) {
        int result[] = { 0, 0 };
        try {
            // 获得文件输入流
            // 从流里将图片写入缓冲图片区
            result[0] =bufferedImage.getWidth(null); // 得到源图片宽
            result[1] =bufferedImage.getHeight(null);// 得到源图片高
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
