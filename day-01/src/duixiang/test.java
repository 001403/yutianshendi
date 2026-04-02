package duixiang;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.score = 100;
        s1.show();
        System.out.println("--------------------------------");


        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 19;
        s2.score = 90;
        s2.show();

    }
}
