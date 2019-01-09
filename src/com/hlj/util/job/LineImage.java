//package com.hlj.util.job;
//
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.*;
//import java.util.UUID;
//
///**
// * 作者 ：HealerJean
// * 日期 ：2018/12/27  下午4:59.
// * 类描述：
// */
//public class LineImage {
//    private final static String SAVE_PATH = "D:\\test";
//
//    public static void main(String[] args) throws Exception {
//        try (InputStream bgImageStream = new FileInputStream(SAVE_PATH + "\\bg.jpg");
//             InputStream textStream = new FileInputStream(SAVE_PATH + "\\text.txt")) {
//
//            BufferedImage bgImage = ImageIO.read(bgImageStream);
//            String text = readText(textStream, "UTF-8");
//
//            Graphics2D g = bgImage.createGraphics();
//            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//            g.setColor(Color.BLACK);
//            g.setFont(new Font("黑体", Font.PLAIN, 20));
//            drawString(g,text, 51.7f, 514, 16, 72, 90, true, true);
//            showImage(bgImage);
//        }
//    }
//
//    /**
//     *
//     * @param g
//     * @param text 文本
//     * @param lineHeight 行高
//     * @param maxWidth 行宽
//     * @param maxLine 最大行数
//     * @param left 左边距
//     * @param top 上边距
//     * @param trim 是否修剪文本（1、去除首尾空格，2、将多个换行符替换为一个）
//     * @param lineIndent 是否首行缩进
//     */
//    private static void drawString(Graphics2D g, String text, float lineHeight, float maxWidth, int maxLine, float left,
//                                   float top, boolean trim, boolean lineIndent) {
//        if (text == null || text.length() == 0) return;
//        if(trim) {
//            text = text.replaceAll("\\n+", "\n").trim();
//        }
//        if(lineIndent) {
//            text = "　　" + text.replaceAll("\\n", "\n　　");
//        }
//        drawString(g, text, lineHeight, maxWidth, maxLine, left, top);
//    }
//
//    /**
//     *
//     * @param g
//     * @param text 文本
//     * @param lineHeight 行高
//     * @param maxWidth 行宽
//     * @param maxLine 最大行数
//     * @param left 左边距
//     * @param top 上边距
//     */
//    private static void drawString(Graphics2D g, String text, float lineHeight, float maxWidth, int maxLine, float left,
//                                   float top) {
//        if (text == null || text.length() == 0) return;
//
//        FontMetrics fm = g.getFontMetrics();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            sb.append(c);
//            int stringWidth = fm.stringWidth(sb.toString());
//            if (c == '\n' || stringWidth > maxWidth) {
//                if(c == '\n') {
//                    i += 1;
//                }
//                if (maxLine > 1) {
//                    g.drawString(text.substring(0, i), left, top);
//                    drawString(g, text.substring(i), lineHeight, maxWidth, maxLine - 1, left, top + lineHeight);
//                } else {
//                    g.drawString(text.substring(0, i - 1) + "…", left, top);
//                }
//                return;
//            }
//        }
//        g.drawString(text, left, top);
//    }
//
//    private static void showImage(BufferedImage image) throws Exception {
//        File file = new File(SAVE_PATH + "\\" + UUID.randomUUID().toString() + ".jpg");
//        FileOutputStream out = new FileOutputStream(file);
//        ImageIO.write(image, "jpg", out);
//        out.flush();
//        out.close();
//
//        if (Desktop.isDesktopSupported()) {
//            Desktop desktop = Desktop.getDesktop();
//            desktop.open(file);
//            System.out.println("显示图片成功");
//        } else {
//            System.err.println("显示图片失败");
//        }
//
//        Thread.sleep(2000);
//        file.delete();
//    }
//
//    private static String readText(InputStream in, String charset) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(in, charset));
//        StringBuilder sb = new StringBuilder();
//        String line = null;
//        while(null != (line = reader.readLine())) {
//            sb.append(line + "\n");
//        }
//        return sb.toString();
//    }
//}
