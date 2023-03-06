package day01;

public class Demo01 {
    //没有main方法的程序是不能执行的
    public static void main(String[] args) {
        /**
         * 变量的作用:
         * 1.用来保存一个值
         * 2.使用变量名来描述保存的含义
         * 具体的语法:
         * 类型 变量民 = 值
         * 例如:
         * int age = 18;
         * 上面这句话的意思是定义一个整数变量,取名为age,它保存的值为整数为18
         *
         * 变量名的选出:英文+数字
         * 尽量避免:中文,汉语拼音
         *
         * 在java中每句话结束时都要加一个(分号)" ; "
         */
        int age = 18;

        int a = 1;
        int b = 2;
        /*
            进行
         */
        //      1 + 2
        int c = a + b;//c = 3
        //输出c时,并不值在控制台上输出一个字符c,因为c是一个变量,输出的是它保存的值
        System.out.println(c);//c的值是3,所以再控制台上看到一个3

        //定义int型变量d,用于保存a乘以b的结果,并将它输出
        int d = a*b;
        System.out.println(d);

        //定义变量e和f,分别保存a-b和a/b的结果并输出
        int e,f;
        e = a-b;
        f = a/b;
        System.out.println(e);
        System.out.println(f);
        /**
         * 变量是可以重复利用的
         * 可以为变量赋予新的值保存
         * 上面我们定义过三个整数类型变量:
         * a = 1
         * b = 2
         * c = 3(进行a+b的结果)
         */
        //计算 3/2  a=3  b=2  c保存商
        a = 3;
        b = 2;
        c = a/b;//计算结果永远是商的整数部分==>1.5的整数部分1
        System.out.println(c);

        /**
         * 数学计算时,也可以直接使用值参与计算
         */
        int g  = 1+2;
        System.out.println(g);

        /**
         * 上面定义过一个变量age保存了年龄是多少?
         * 如果我想计算23年后这个人的年龄是多少?
         *
         * age = age+23;
         * 程序运算的顺序:
         *1.先进性数学计算  age+23===>18+23===>41
         * 2.结果41重新赋值给age进行保存
         */
        age = age+23;
        System.out.println(age);//41

    }
}
