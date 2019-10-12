package DEMO00;
/*三元运算符:需要三个数据才能进行操作的运算符
格式 :
   数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B
流程:
首先判断条件是否成立
如果成立为ture 那么表达式A的值赋值给左侧的变量;
如果不成立为false,那么表达式B的值赋值给左侧的变量

注意事项
    必须同事保证表达式A和表达式B都符合左侧数据类型的要求
     三元运算符的结果必须被使用*/
public class DEMO2 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        int max = a > b ? a:b; //最大值的变量
        System.out.println("最大值:"+max);
    }
}
