package day02;

import java.util.SplittableRandom;

/**
 * 字符串类型
 * 字符串就是若干个字符组成,使用双引号""括起来
 * 在Java中字符串类型为:String
 *                   ^S是大写
 */
public class Demo05 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        /**
         * 字符串可以使用 + 进行运算,实际操作时连接字符串
         */
        String s3 = s1+s2;//"Hello"+"World"
        System.out.println(s3);//HelloWorld

        //字符串可以与其他类型进行加法运算,但是结果是字符串类型
        //
        int a = 123;
        String b = "123";
        /**
         * 1.首先将非字符串变量a转换成字符串来表示
         *      123---"123"
         * 2.在将转换后的"123"与字符串变量b"123"拼接
         *      "123"+"123"==>"123123"
         */
        String str = a+b;
        System.out.println(str);//123123

        //字符串在后面,先计算前年的加法再拼接后面的字符串
        str = 1+2+3+"4";//6+"4"
        System.out.println(str);//64
        //字符串在前面,后面的数值加号变为连接符
        str = "1"+2+3+4;//"1"+"2"+"3"+"4"
        System.out.println(str);
        //乘除优先级高于加减
        str = 1+2+"3"+4*5;//"3"+"3"+"20"
        System.out.println(str);//3320
        //先算3*4,所 + 变为连接符
        str = 1+"2"+3*4+5;//"1"+"2"+"12"+"5"
        System.out.println(str);//12125

        /**
         * 字符串也是可以判断,但是是调用字符串的方法:equals
         * 注意!!!不能使用 == 进行等于判断,它不一定总是成功的
         *
         */
        String str1 = "hello";
        String str2 = "hello";
//        boolean tf = str1==str2;//不能满足所有情况对于字符串相等的判断
        boolean tf = str1.equals(str2);
        System.out.println(tf);
    }
}
