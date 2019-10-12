package DEMO00;
/*
有参数和无参数
对于有返回值的方法,可以使用单独调用,打印或者赋值调用

 */
public class DEMO8method {
    public static void main(String[] args){
        int num = getSum(10,20);
        System.out.println("返回值是:" + num);
        System.out.println("==========");

        printSum(100,200);
    }

    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("结果是:" + result);
    }
}
