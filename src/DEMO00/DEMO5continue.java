package DEMO00;
/*
另一种循环控制语句是continue关键字
一旦执行,立即跳过当前次循环剩余内容,马上开始下一次循环
 */
public class DEMO5continue {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i + "层到了");
        }
    }
}
