package DEMO01;
/*
一旦使用private进行修饰,那么本类当中仍然可以进行随意访问
但是超出本类范围之外就不能再直接访问了

间接访问private成员变量就是一对Getter/Setter方法
 */
public class Person {
        String name;
        private int age;

        public void show(){
            System.out.println("我叫:" + name + "年龄: " + age);
        }

        public void setAge(int num){
            if (num < 100 && num >= 0) {
                age = num;
            } else {
                System.out.println("数据不合理!");
            }
        }

        public int getAge(){
            return age;
        }

}
