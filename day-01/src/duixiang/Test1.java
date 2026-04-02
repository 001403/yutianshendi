package duixiang;

public class Test1 {
    public static void main(String[] args) {
        //认识类的构造器，搞清楚特点和常见应用场景
      Student1 s1 = new Student1();
      Student1 s2 = new Student1("西门吹雪");

      Student1 s4=new Student1();
      s4.name="小李";
      s4.age=20;
      s4.sex='女';
      System.out.println(s4.name+"---"+s4.age+"---"+s4.sex);
      /*常见应用场景：创建对象时，
        同时完成对对象成员变量（属性）的初始化*/

        Student1 s3 = new Student1("小王",18,'男');

        System.out.println(s3.name+"---"+s3.age+"---"+s3.sex);


    }
}
