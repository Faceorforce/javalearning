package DEMO01;

public class DEMOphone1 {
    public static void main(String[] args) {
//        格式:类名称 对象名 = new 类名称();
        phone one = new phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=====");

        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "red";
        System.out.println(one.price);


        one.call("乔布斯");
        one.sendMessage();
    }
}
