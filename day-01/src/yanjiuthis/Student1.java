package yanjiuthis;

public class Student1 {
    //成员变量
    String name;


    //this是一个变量，它代表当前对象
    //那个对象调用这个方法，this就拿到那个对象

    public void print(){
        System.out.println(this);
    }
    //局部变量
    public void printHobby(String name){
        System.out.println(this.name+"喜欢"+name);
    }
}
