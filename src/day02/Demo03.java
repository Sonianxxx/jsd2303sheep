package day02;

public class Demo03 {
    public static void main(String[] args) {
        int num = 10;
        num = num%3;//计算10/3的余数是多少:  商3余1
        System.out.println(num);

        System.out.println(0%4);//0  0除以4商为0  余数是0
        System.out.println(1%4);//1  1除以4商为0  余数是1
        System.out.println(3%4);//3  3除以4商为0  余数是3
        System.out.println(4%4);//0  4除以4商为1  余数是0
        System.out.println(7%4);//3  7除以4商为1  余数是3
        System.out.println(8%4);//0  8除以4商为2  余数是0
    }
}
