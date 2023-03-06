package day01;


import javax.swing.*;

/**
 *
 *  使用java提供的的各种各样的组件(工具)的语法
 *  并尝试创建一个可视化的窗体
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        /**
         * 创建一个窗口的基本步骤:
         * 1.定义一个窗口类型变量,用来保存一个窗口
         *   窗口的结构比一个数字的结构要复杂许多,但是也是用一个变量保存
         *   语法:
         *   类型 变量名 = new 类型();
         *
         *   注意:在java中,类型的拼写(包括大小写)都是固定的.
         *   例如: JFrame中的JF必须是大写
         *        int类型都是小写
         */
        /**
         * 如果下面写好的代码后,报错:
         * 1.检查是否有拼写错误
         * 2.JFrame没有导包(后面学到面向对象时老师会详细说明)
         *   解决办法,鼠标停留在报红处的位置,按下 alt+回车键
         *   选第一个(import class)
         */
        //JFrame是java中的窗口类型
        JFrame frame = new JFrame("羊了个羊");

        /**
         *   setSize用来设置窗口的宽高
         *   width:宽度
         *   height:高度
         */
        //设置窗口大小
        frame.setSize(420,700);

        /**
         *  Location:位置
         *  setLocation可以设置窗口在桌面上的坐标
         *  注意:桌面的左上角是直角坐标系的原点
         */
        //设置窗口位置
//        frame.setLocation(400,200);
        //这句话固定写法,
        frame.setLocationRelativeTo(null);

        //设置窗口是否可以调整大小(true是允许,false是不允许)
        frame.setResizable(false);


        /**
         * 单词:
         * visible:可见的
         * set:设置
         * 在java中,各种组件都具有很多功能,想使用这些功能的语法:
         *   变量名.功能();  功能在java中实际上被称作"方法,函数"
         */
        //设置窗口可见
        frame.setVisible(true);//()中传入true表达可见  false表达可见

    }

}
