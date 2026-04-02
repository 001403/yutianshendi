package com.yutian;

public class caishuzi {
    static void main() {
        //目标：开发验证码
        //1.调用一个方法返回执行位数的验证码，每位只能是数字或者大写字母或者小写字母
        System.out.println(getCode(4));
        System.out.println(getCode(5));
        }
        public static String getCode(int n){
           String code = "";
           for(int i = 0; i < n; i++){
               int number = (int)(Math.random()*3);
               switch (number){
                   case 0:
                       code += (int)(Math.random()*10);
                       break;
                   case 1:
                       code += (char)(Math.random()*26+'a');
                       break;
                   case 2:
                       code += (char)(Math.random()*26+'A');
                       break;
               }


           }
           return code;
        }

}
