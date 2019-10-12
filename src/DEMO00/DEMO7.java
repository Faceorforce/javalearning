package DEMO00;
/**/
public class DEMO7 {
    public static  void main(String[] args){
        System.out.println(sum(10,20));

        int number = sum(15,25);
        number +=100;
        System.out.println("变量的值:" + number);
    }
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
