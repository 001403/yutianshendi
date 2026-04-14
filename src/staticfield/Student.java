package staticfield;

public class Student {
    //静态变量，有static修饰，属于类，只加载一份，可被类和类的全部对象共享
    static String name;
    //实例(对象)变量，没有static修饰，属于对象，每个对象都有一份
    int age;
}
