package yanjiufengzhuang;

public class Student {
    String name;
    //如何隐藏，使用private关键字（私有，隐藏）修饰成员变量，就只能在本类中被直接访问
    //其他任何地方不能直接访问
    private int age;
    private double chinese;
    private double math;

    //如何暴露（合理暴露）,使用public修饰（公开）的getter和setter方法
    public void setAge(int age){
        if(age>0&&age<100){
            this.age=age;
        }
        else{
            System.out.println("输入的参数有误");
        }
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }


    public void  printAllScore(){
        System.out.println(name + "的总成绩是:" + (chinese + math));
    }
    public void printAverageScore(){
        System.out.println(name + "的平均成绩是:" + (chinese + math) / 2);
    }

}
