package duixiang;
//创建对象时，对象会自动调用构造器

public class Student1 {
    //构造器：是一种特殊方法，不能写返回值类型，不能有返回值，方法名必须与类名相同
    //无参构造器
    String name;
    int age;
    char sex;

    public Student1(){
        System.out.println("-----无参构造器执行了-------");
    }
    //有参构造器
    public Student1(String n){
        System.out.println("-----有参String n构造器执行了-------");
    }
    public Student1(String n,int a){

    }
    public Student1(String name,int age,char sex){

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
//构造器的注意事项：默认自带了一个无参构造器
//如果定义了有参数的构造器，那么默认的构造器就没有了
//还想用无参构造器，就必须自己写一个无参构造器
