package staticfield;
public class Test {
    static void main(String[] args) {
        //目标：认识static修饰成员变量，特点，访问机制，搞清楚作用
        //1.类名.静态变量（推荐）
        Student.name="袁华";
        System.out.println(Student.name);
        //2.对象名.静态变量（不推荐）
        Student s1 = new Student();
        s1.name="马冬梅";
        Student s2 = new Student();
        s2.name="王小虎";
        System.out.println(s1.name);
        System.out.println(Student.name);
        //对象名.实力变量
        s1.age=18;
        s2.age=19;
        System.out.println(s1.age);
        System.out.println(s2.age);
        //同一个类中，可以省略类名不写

    }
}
