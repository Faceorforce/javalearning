package DEMO00;
/*
switch语句抵用的注意事项
多个case后面的数值不可以重复
switch后面的小括号当中只能是下列数据
基本数据类型 byte/short/char/enum枚举

switch语句前后顺序可以颠倒,break语句可以省略
匹配到哪一个case就从哪一个位置向下执行,直到遇到break或者整体结束为止
*/
public class DEMO4 {
    public static void main(String[] args){
        int num = 2;
        switch(num){
            case 1:
                System.out.println("你好");
                break;
            case 2:
                System.out.println("我好");
                break;
        }
    }
}

