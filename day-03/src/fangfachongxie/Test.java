package fangfachongxie;

public class Test {
    public static void main(String[] args) {
        //目标：认识继承中的方法重写，再搞清楚场景
        //当子类觉得父类的方法不好用，或不能满足需求时，就可以重写这个方法
        Cat c1 = new Cat();
        c1.cry();
    }
}
    class Cat extends Animal{
        //方法重写：方法名称，形参列表必须相同，这个方法就是方法重写
        //声明不变，重新实现
        @Override//方法重写的校验注解（标志）：要求方法名称，形参列表必须与被重写方法一致，否则报错！更安全
        public void cry(){
            System.out.println("🐱喵喵喵的叫~~~~~");
        }
    }
    class Animal{
        public void cry(){
            System.out.println("动物叫");
        }
    }

//方法重写的其他注意事项
//1.子类重写父类方法时，访问权限必须大于或者等于父类方法的权限吧
//2.子类重写父类方法时，方法返回值类型必须与父类方法一致或者子类返回值类型更小
//3.私有方法，静态方法不能被重写，如果重写就会报错