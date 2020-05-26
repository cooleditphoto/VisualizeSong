package com.qiumuzi.VisualizeSong;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ColorPercentage {

    public void calculateColorPercentage(String image){
        File file = new File(image);
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //长宽
        int width = bi.getWidth();
        int height = bi.getHeight();

        //横纵坐标起始点
        int minx = bi.getMinX();
        int miny = bi.getMinY();

        //绿色像素点个数
        long greenNumber = 0;


        int[] rgb = new int[3];// 定义RGB空间
        float[] hsv = new float[3];// 定义HSV空间

        // 开始遍历所有像素点
        for (int i = minx; i < width; i++) {
            for (int j = miny; j < height; j++) {

                // 当前像素点
                int pixel = bi.getRGB(i, j);

                // 获取RGB各值
                rgb[0] = (pixel & 0xff0000) >> 16;//R
                rgb[1] = (pixel & 0xff00) >> 8;//G
                rgb[2] = (pixel & 0xff);//B

                // rgb转hsv
                Color.RGBtoHSB(rgb[0], rgb[1], rgb[2], hsv);

                //使用hsv判断该像素点是否可以判定为绿色像素点
                if (hsv[2] >= 0.075 && hsv[1] >= 0.15 && hsv[0] > 0.1389 &&
                        hsv[0] <= 0.4444) {
                    greenNumber++;
                }
            }
        }

    }
}
