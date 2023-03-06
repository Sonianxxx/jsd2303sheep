package day01;

/**
 * 类(class)---驼峰命名方法
 * .java文件
 * HelloWorld.java文件被称为是源文件
 * 源文件是给人看的,JAVA执行程序是运行.class文件(字节码文件)
 *
 * 安装JDK后,会附带一个程序:编译程序.
 * 编译程序可以理解为是一个翻译,它是将.java文件内容翻译为.class文件
 *
 * 原始的编译过程:
 * 1.程序员写好.java文件(写好程序)
 * 2.使用javac命令,调用编译器将java文件翻译为class文件
 * 3.执行java命令执行class文件运行程序
 *
 * 现在的做法:
 * 1.程序员的做法写好.java文件
 * 2.IDEA会自动编译(我们写好一句话,IDEA就会编译一次)
 * 3.运行程序(程序要有main方法)
 *
 * 步骤:1
 * 1.在day01鼠标右键,新建一个java class
 *   取名HeloWorld2
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        //向控制台上输出一行字符串(一行代码)
        //在java中,一行字符串使用双引号括起来:"helloworld"
        //希望输出的内容要放在println后面的园括号里
        System.out.println("HelloWorld");
    }
}
