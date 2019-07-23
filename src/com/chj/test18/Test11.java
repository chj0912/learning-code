package com.chj.test18;

import java.util.Random;
import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {


        Runnable r = new Runnable() {
            DoubleColorBallUtil d = new DoubleColorBallUtil();
            int num = 100;
            int q = 0;
            int h = 0;
            @Override
            public void run() {
                String name = Thread.currentThread().getName();

                while (true) {
                    synchronized (d) {

                        try {
                            if (num <1) {
                                if(name.equals("前门")){
                                    System.out.println("从前入场的员工" + q);
                                }
                                if(name.equals("后门")){
                                    System.out.println("从后门入场的员工" + h);
                                }

                                break;
                            }

                            Thread.sleep(100);
                            if (name.equals("前门")) {
                                System.out.println("编号为：" + (100-num+1) + "的员工,从" + name + "入场.拿到的双色球号码是" + d.create());
                                q++;
                                num--;
                            } else if (name.equals("后门")) {
                                System.out.println("编号为：" + (100-num+1) + "的员工,从" + name + "入场.拿到的双色球号码是" + d.create());
                                h++;
                                num--;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        };

        new Thread(r, "前门").start();
        new Thread(r, "后门").start();


    }

}

class DoubleColorBallUtil {
    // 产生双色球的代码
    public String create() {
        String[] red = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};
        //创建蓝球
        String[] blue = "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");
        boolean[] used = new boolean[red.length];
        Random r = new Random();
        String[] all = new String[7];
        for (int i = 0; i < 6; i++) {
            int idx;
            do {
                idx = r.nextInt(red.length);//0‐32
            } while (used[idx]);//如果使用了继续找下一个
            used[idx] = true;//标记使用了
            all[i] = red[idx];//取出一个未使用的红球
        }
        all[all.length - 1] = blue[r.nextInt(blue.length)];
        Arrays.sort(all);
        return Arrays.toString(all);
    }
}