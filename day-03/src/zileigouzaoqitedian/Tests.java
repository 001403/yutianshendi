package zileigouzaoqitedian;

public class Tests {
    public static void main(String[] args) {
       //目标：理解this调用兄弟构造器
        //创建对象，存储一个学生的数据
        Students s1 = new Students("小王",18,'男');
        System.out.println(s1);
        System.out.println("===========================");
        Students s2 = new Students("小王",18,'男',"清华大学");
        System.out.println(s2);
    }
}
