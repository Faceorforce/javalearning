package DEMO01;

public class DEMOphone2 {
    public static void main(String[] args) {
        phone one = new phone();
        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "blue";

        method(one);
    }

    public static void method(phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
