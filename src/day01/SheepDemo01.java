package day01;

import javax.swing.*;

public class SheepDemo01 {
    public static void main(String[] args) {
        //创建窗口
        JFrame frame = new JFrame("羊了个羊");
        //创建画布
        JPanel panel = new JPanel();//创建一个面板

        //准备一张图片
        JLabel label = new JLabel(
                //括号中指定要使用的图片路径
                new ImageIcon("res/背景.jpg")
        );//创建一个用于表示图片的组件
        //设置背景大小
        label.setSize(480,800);

        /**
         *   add:添加
         */
        //将图片放到画布上
        panel.add(label);
        //将画布放到面板上
        frame.add(panel);

        /**
         *
         * setDefaultCloseOperation()
         * 功能是当我们点击窗口上的关闭时的默认操作,不设置时默认操作时,仅仅是关闭窗口
         */
        //设置关闭窗口时程序运行结束.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小
        frame.setSize(480,800);
        //设置窗口居中
        frame.setLocationRelativeTo(null);
        //设置窗口不可调整
        frame.setResizable(false);
        //设置窗口可见
        frame.setVisible(true);
    }
}
