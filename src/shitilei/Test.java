package shitilei;

public class Test {
    //目标：搞清楚实体类是啥，搞清楚其基本作用和应用场景
    //实体类的基本作用，创建它的对象，存取数据（封装数据）
    static void main(String[] args) {
        Student s1=new Student();
        s1.setName("波妞");
        s1.setMath(100);
        s1.setChinese(100);
        Student s2=new Student("波仔",99,98);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());
        System.out.println("-----------------");
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());
       //实体类在开发中的应用场景。
        //创建一个学生的操作对象专门负责对学生对象的业务处理
        StudentOperate operater =new StudentOperate(s1);
        operater.printAvg();
        operater.printScore();
    }
}
