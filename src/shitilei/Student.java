package shitilei;
//实体类（类默认有一个无参构造器)
public class Student {
    //1.成员变量私有
    private String name;
    private double chinese;
    private double math;

    public Student() {
    }

    //可提供一个有参构造器（可选）
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    //2.提供getter和setter方法
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
}
