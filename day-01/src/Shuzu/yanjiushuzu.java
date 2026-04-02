package Shuzu;

public class yanjiushuzu {
    public static void main(String[] args) {
      // 创建一个数组
      int[] a = {1,2,3,4,5,6,7,8,9,10};
      //一维数组的动态初始化
        int[] b = new int[10];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        //用循环输出数组
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
            if(i==b.length-1){
                System.out.println();
            }
        }
        //用循环输出数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        erweishuzu();

    }
    public static void erweishuzu(){
      //二维数组的动态初始化
        int[][] c = new int[3][4];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[0][3] = 4;
        c[1][0] = 5;
        //二维数组的输出
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+" ");
            }
        }

    }
}
