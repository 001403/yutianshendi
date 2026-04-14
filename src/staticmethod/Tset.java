package staticmethod;

public class Tset {
    static void main(String[] args) {
        //目标：认识static修饰和不修饰方法的区别
        //1.类名.静态方法（推荐）
        Student.printHeelo();
        //2.对象.静态方法(不推荐)
        Student s1 = new Student();
        s1.printHeelo();

        //对象名.静态方法（报错）列：student.printHeelo();
        //对象名.实例方法
        s1.printScore(59.5);
        s1.printpass();

        //规范：如果这个方法只是为了一个功能且不需要直接访问对象的数据，那么这个方法就可以定义为静态方法
        //如果这个方法是对象的行为，需要访问对象数据，那么这个方法就不应该定义为静态方法（定义为实例方法（无static修饰））
}}
