package DEMO01;

public class DEMOphone3 {
    public static void main(String[] args) {
        phone two = getphone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static phone getphone(){
        phone one = new phone();
        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "black";
        return one;
    }
}
