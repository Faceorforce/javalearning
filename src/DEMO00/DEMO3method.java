package DEMO00;
/*
定义一个方法的格式:
public static void 方法名称(){
方法体
}
方法名称的命名规则和变量相同 使用小驼峰
方法体:也是大括号当中可以包含任意语句

注意事项:
方法定义顺序不影响
方法的定义不能产生嵌套关系
方法定义好需要调用才可以 执行
*/
public class DEMO3method {
    public static void main(String[] args){
        cook();
    }
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");

    }
}
