package com.yutian;


import java.util.Scanner;

public class suanyuan {
    static void main() {
        //
        test1();
    }
    public static void test1(){
       Scanner sc = new Scanner(System.in);
       double n=sc.nextDouble();
       double m=sc.nextDouble();
       String s=sc.next();
       switch (s){
           case "+":
               System.out.println(n+m);
               break;
           case "-":
               System.out.println(n-m);
               break;
           case "*":
               System.out.println(n*m);
               break;
           case "/":
               System.out.println(n/m);
               break;
           default:
               System.out.println("error");
       }
    }

   }