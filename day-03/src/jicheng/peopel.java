package jicheng;
//父类
//继承的好处1.代码复用2.减少了重复代码3.子类对象可以调用父类对象的属性
public class peopel {
    private String name;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
