package day02;

/**
 * JAVA中常用的数据类型
 * 整数数类型:int long
 * 浮点(小数)型:float(单精度) double(双精度)
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * int 值有取值范围,为21亿多,负数也是-21亿多
         * 在java中我们指定一个数字作为整数的值时,这个数字默认就是int型
         */
        //   123默认是int类型
        int num = 123;
        System.out.println(num);
        /**
         *    当数字超过int最大值时,那么要在数字后面添加字符"l"或者"L"表示long值
         *    为了避免l与数字1混淆,建议最后使用大写字母"L"表示long值
         */
        long bignum1 = 3000000000L;//30亿
        long bignum2 = 3000000000l;//30y亿

        /**
         *  小数类型(浮点数类型)
         *  当我们使用一个数字表示小数时,默认类型为double类型
         */
        double dou = 123.123;
        //显示double最大值
        System.out.println(Double.MAX_VALUE);
        //当数字表示float类型时,数字最后要添加字符"f"或者"F"
        float flo = 123.123f;//float类型实际开发使用很少,了解即可
        /**
         * 总结:
         * 1.在java中,整数最常用的使用的是int类型
         *   浮点数(小数)最长用的是double类型
         * 2.当我们指定一个数字时,整数的数字默认为int类型
         *   当我们指定一个数字时,小数(浮点)的数字默认为double类型
         */
        int i1 = 1+1;
        long l1 = 123l;
        //两个整数类型相加时结果变为较大数据类型    int+long=long
        long n = i1+l1;
        /**
         * 问题:
         * 两个int值相加超出int最大值范围结果是什么类型?
         *  int类型,会变为负数
         */

        //double与int计算,结果为double类型
        double dd = 1.0/2;//0.5    double/int=double
        System.out.println(dd);

        //多个数字运算时,符合先乘除后加减
        int b = 2+3*3;//11
        System.out.println(b);

        //希望提高运算优先级时,可以使用圆括号
        b = (2+3)*3;//15
        System.out.println(b);
    }

}
