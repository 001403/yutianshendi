package jicheng;

public class Test {
    //目标：认识继承，好处
    //1.创建对象，封装老师数据
    //子类可以继承父类的非私有成员变量和成员方法
    //子类对象是由子类和父类多张设计图共同创建出来的对象，所以子类对象是完整的
    static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("小王");
        t1.setSkill("大数据学习");
        t1.setSex('男');
        //打印
        System.out.println(t1.getName()+"---"+t1.getSkill()+"---"+t1.getSex());
    }

}
//继承的权限修饰符
//1.private:只能本类
//2.缺省（没有权限修饰符）：本类，同一个包中的类
//3.protected：本类，同一个包中的类，子孙类
//4.public：本类，同一个包中的类，子孙类，其它包中的类
//继承的特点
//1.单继承：一个类只能有一个父类2.java不支持多继承，但支撑多层继承3.祖宗类：java中的所有类都是objeet类的子类
//4.就近原则：优先访问自己类中，如果没有，再访问父类中。如果子父类，出现了重名的成员或方法，（可以在前加super.）可指定访问父类成员