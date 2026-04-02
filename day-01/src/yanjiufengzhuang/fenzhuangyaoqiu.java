package yanjiufengzhuang;

public class fenzhuangyaoqiu {
    public static void main(String[] args){
        //目标：搞清楚封装的设计思想，合理隐藏合理暴露，学会如何隐藏如何暴露
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("小王");
        s1.setChinese(100);
        s1.setMath(100);
        s1.printAllScore();
        s1.printAverageScore();
    }
}
