package com.example.untitled;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car1 = new Car(10);
        Car car2 = new Car(20);

        car1.run();
        car2.run();
    }
}

class Car{
     private int speed;

     void run(){
         System.out.println("자동차가 최고속력" + speed +"으로 달립니다.");
     }

     Car(int speed){
         this.speed = speed;
     }
}