package day02;

import javax.swing.*;

public class SheepDemo01 {
    public static void main(String[] args) {
        /**
         * 单词:
         * button:按钮的意思
         * card:卡牌
         * add:添加
         * border:边框
         * paint:绘制
         * Content:内容
         * Area:区域
         * Filled:填充
         */
        //创建窗口
        JFrame frame = new JFrame("羊了个羊");
        //创建画布
        JPanel panel = new JPanel();//创建一个面板
        panel.setLayout(null);//取消默认布局

        //准备一张图片
        JLabel background = new JLabel(
                //括号中指定要使用的图片路径
                new ImageIcon("res/背景.jpg")
        );//创建一个用于表示图片的组件
        //设置背景大小
        //由于panel画布没有布局,放到画布上的内容需要自行设置的大小,位置,默认值是0
        background.setSize(480,800);

        //将图片放到画布上
        panel.add(background);

        //添加一个按钮在画布上
        JButton card = new JButton(
                new ImageIcon("res/兔子.png")
        );
        card.setSize(59,66);
        card.setLocation(30+0*60,100);
        card.setBorderPainted(false);//false:不绘制边框,反之true
        card.setContentAreaFilled(false);//false:不填充内容区域(底色),反之true
        panel.add(card,0);//将按钮放在画布上,0表示下标

        card = new JButton(
                new ImageIcon("res/萝卜.png")
        );
        card.setSize(59,66);
        card.setLocation(30+1*60,100);
        card.setBorderPainted(false);//false:不绘制边框,反之true
        card.setContentAreaFilled(false);//false:不填充内容区域(底色),反之true
        panel.add(card,0);//将按钮放在画布上,0表示下标

        card = new JButton(
                new ImageIcon("res/帽子.png")
        );
        card.setSize(59,66);
        card.setLocation(30+2*60,100);
        card.setBorderPainted(false);
        card.setContentAreaFilled(false);
        panel.add(card,0);

        //将画布放到面板上
        frame.add(panel);

        /**
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
        frame.setResizable(true);
        //设置窗口可见
        frame.setVisible(true);
    }
}
