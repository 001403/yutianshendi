package zileigouzaoqitedian;

public class Students {
    private String name;
    private int age;
    private char sex;
    private String school;
    public Students(String name,int age,char sex){
        //this调用兄弟构造器
        //注意：super（...）和this（...）不能同时使用,必须写在构造器的第一行
        this(name,age,sex,"黑马程序员");
    }
    public Students(String name,int age,char sex,String school){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    @Override
    public String toString(){
        return "姓名："+name+"---年龄："+age+"---性别："+sex+"---学校："+school;
    }
}
