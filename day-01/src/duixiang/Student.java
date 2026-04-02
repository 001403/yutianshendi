package duixiang;

public class Student {
    String name;
    int age;
    double score;

    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"，成绩："+score);
    }
    public void set(String n,int a,double s){
        name = n;
        age = a;
        score = s;
    }

}
