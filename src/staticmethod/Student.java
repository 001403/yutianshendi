package staticmethod;

public class Student {
    private double score;

    //静态方法，有static修饰，属于类持有
    public static void printHeelo() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    //实例方法，没有static修饰，属于对象持有
    public void printScore(double score) {
        this.score = score;
    }
    public void printpass(){
        if(score>=60){
            System.out.println("通过");
        }
        else{
            System.out.println("没通过");
        }
    }
}
