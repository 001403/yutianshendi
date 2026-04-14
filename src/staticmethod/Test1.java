package staticmethod;

public class Test1 {
    static void main(String[] args) {
        //目标：搞清楚静态方法，实例方法访问的几点注意事项
    }
    //1.静态方法中可以直接访问静态成员变量，静态方法中不可以直接访问实例成员变量
    static void print(){

    }
    //2.实例方法既可以直接访问静态成员变量，也可以直接访问实例成员变量
    //3.实例方法中可以出现this关键字，静态方法中不可以出现this关键字
}
