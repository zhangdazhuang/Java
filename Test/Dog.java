package Test;

import java.util.Arrays;

public class Dog {
    String breed;
    int size;
    String colour;
    int age;
    int sleeptime;
    String name;

    public Dog(String name) { // 构造方法
        this.name = name;
    }

    void eat() {
        System.out.println("eat");
        System.out.println(age);

    }

    void run(int speed) {
        System.out.println("奔跑速度：" + speed);
    }

    void sleep() {
        System.out.println("sleep时长：" + sleeptime);
    }

    void name() {
        System.out.println(name);
    }

    enum Color
    {
        RED, GREEN, BLUE;
    }
    public static void main(String[] args) {
        Dog dog = new Dog("dd");
        dog.age = 11;
        dog.eat();
        dog.name();
        dog.run(1000);
        String s = "20";
        int a = Integer.valueOf(s);
        System.out.println(a);
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        Arrays.sort(myList);
        double[] ass  = {1.9, 3.4,2.9,  3.5};
        boolean dd = Arrays.equals(myList, ass);
        System.out.println(dd);
        int aa = Arrays.binarySearch(myList, 2.9);
        System.out.println(aa);
        for (double i : myList) {
            System.out.println(i);
         }



    }

}
