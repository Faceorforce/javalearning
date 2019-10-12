package DEMO00;
/*
自增自减 ++ --
1 单独使用 不和其他任何操作混合使用
2 混合使用 和其他操作混合
如果是前++,那么变量立刻,马上+1,然后拿着结果使用
如果后++,那么首先使用的变量本来的数值,然后在让变量+1
 */
public class DEMO1 {
    public static void main(String[] args){
        int num1 = 10;
        System.out.println(num1);

        int num4 = 40;
        int result = --num4;
        System.out.println(result);
        System.out.println(num4);
    }
}
