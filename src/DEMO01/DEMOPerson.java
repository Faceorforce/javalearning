package DEMO01;

public class DEMOPerson {

    public static void main(String[] args) {
        Person person = new Person();
//        person.show();

        person.name = "梁浩";
//        person.age = 20; 直接访问private内容,错误写法
        person.setAge(22);
        person.show();
    }
}
