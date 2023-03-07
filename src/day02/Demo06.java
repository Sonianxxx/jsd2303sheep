package day02;

/**
 * 促销打折:满500减100,没满减30
 */
public class Demo06 {
    public static void main(String[] args) {
        int price = 550;
        boolean tf = price>=500;//true
        if (tf){//满足if执行if后面{}里面语句
            price = price-100;
        }else {
            price = price-30;
        }
        String str = "您本次消费共:"+price;
        System.out.println(str);//450
        price = 300;
        tf = price>=500;//false
        if (tf){//不满足if,跳过if执行else
            price = price-100;
        }else {
            price = price-30;
        }
        str = "您本次消费共:"+price;
        System.out.println(str);//270
    }
}
