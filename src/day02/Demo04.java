package day02;

/**
 * 问题:
 * 淘宝的商店想要做一个促销,如果一次性购买300元以上的商品是,可以立减50.
 *
 * 在java中,当我们要要执行某些操作时,需要判断条件是否通过,若果通过则执行某项指令
 *
 * if(boolean){
 *     当boolean为true时执行{}里面语句
 * }
 */
public class Demo04 {
    public static void main(String[] args) {
        int price = 260;//消费260
        boolean boo = price<=300;//false
        if (boo){
            price = price-50;
        }
        System.out.println(price);//实际付款260
        price = 310;//消费310
        boo = price<=300;//true
        if (boo){
            price = price-50;
        }
        System.out.println(price);//实际付款260
    }
}
