package yanjiuthis;

public class test1 {
    static void main() {
        //目标：认识this关键字，搞清楚它的应用场景
        Student1 s1 = new Student1();
        s1.print();
        System.out.println(s1);
        System.out.println("-----------------");
        Student1 s2 = new Student1();
        s2.print();
        System.out.println(s2);
        System.out.println("-----------------");
        Student1 s3 = new Student1();
        s3.name="汪苏泷";
        s3.printHobby("唱歌！");
    }
    /*this用来解决对象的成员变量与
     方法内部变量的名称一样，导致访问冲突问题的*/

}
