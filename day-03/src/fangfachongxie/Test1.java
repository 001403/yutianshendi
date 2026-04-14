package fangfachongxie;

public class Test1 {
    public static void main(String[] args) {
    //目标：方法重写的常见应用场景：子类重写objiect的toSting方法，以便返回对象的内容。
    Student s1 = new Student("小王",18,'男');
    System.out.println(s1.toString());//输出：Student@1b6d3586
        System.out.println(s1);
        //注意1.直接输出对象，默认会调用Object的toString方法，返回对象地址
        //注意2.输出对象的地址实际上是没有什么意义的，开发者更希望输出对象的内容，所以重写toString方法，返回对象的内容

    }
}
class  Student extends Object{
    private String name;
    private int age;
    private char sex;
    @Override
    public String toString(){
        return "Student[name="+name+",age="+age+",sex="+sex+"]";
    }
    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}