package zileigouzaoqitedian;

public class test {
    public static void main(String[] args){
      //目标：认识子类构造器的特点，再看应用场景
      //子类构造器都会必须先调用父类的构造器，再执行自己的构造器
      Zi z=new Zi();
  }
}
class Fu{
    public Fu(){
        //super();默认存在的，写不写都有
        //super(1);指定调用父类有参构造器
        System.out.println("父类无参构造器");
    }
    public Fu(int a){
        System.out.println("父类有参构造器");
    }
}
class Zi extends Fu{
    public Zi(){
        System.out.println("子类无参构造器");
    }
}
//默认情况下，子类全部构造器的第一行代码都是super();写不写都有，他都会调用父类的无参构造器
//若父类没有无参构造器则我们必须在子类的第一行手写一行super(参数)，指定去调用父类的有参构造器
