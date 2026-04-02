package com.yutian;

public class fangfa1 {
    static void main() {
             start();
    }
    public static void start(){
        //1.做牌：创建一个动态初始化的数组，里面存放54张牌
        String[] cards = new String[54];
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int index = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < colors.length; j++){
                cards[index] = colors[j] + numbers[i];
                index++;
            }
        }
        cards[index++] = "xiaowang";
        cards[index] = "dawang";

        System.out.println("新牌");
        for(int i=0;i<cards.length;i++){
            System.out.print(cards[i]+"\t");

        }

        System.out.println("\n洗牌");
        for(int i=0;i<cards.length;i++){
            int j = (int)(Math.random()*cards.length);
            String temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        for(int i=0;i<cards.length;i++){
            System.out.print(cards[i]+"\t");
        }
    }
}
