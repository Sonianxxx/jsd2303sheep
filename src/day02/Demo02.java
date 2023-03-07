package day02;

/**
 * 布尔类型
 * boolean 类型只有两个值: 真 或 假
 *               对应值:true或false
 * 布尔类型通常是通过关系运算符得到结果
 * 运算符:<  >  ==  <=  >=  !=
 */
public class Demo02 {
    public static void main(String[] args) {
        boolean boo = true;
        System.out.println(boo);//true
        boo = false;
        System.out.println(boo);//false

        int age = 17;//17岁
        //年龄小于25岁就是年轻
        boolean young = age<25;//返回值true
        System.out.println(young);

        age = 25;
        young  = age<25;//false
        System.out.println(young);

        //年龄小于等于25岁就是年轻
        young = age<=25;//true
        System.out.println(young);

        //age = 25;   是将25这个数字交给age去保存,称作赋值
        //age == 25:  是判断变量值是否与后面指定值相等
        //注:equ:equal,是英文"相等"的意思
        boolean equ = age == 25;//age保存值是否相等25


        /**
         * 总结:
         * 1.boolean
         */
    }
}
