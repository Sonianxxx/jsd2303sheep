package day02;

public class Test02 {
    public static void main(String[] args) {
        //如果满18岁可玩游戏,否则不可以玩游戏
        int age = 23;
        boolean tf = age>=18;
        if(tf){
            System.out.println("可以玩");
        }else {
            System.out.println("不可以玩");
        }

        String str = "可以玩";
        if (age<18){
            str = "不"+str;
        }
        System.out.println(str);
    }
}
