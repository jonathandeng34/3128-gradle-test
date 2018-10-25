package org.team3128.lessons.inheritance;
public class Dog extends Animal{

    @Override
    public void move() {
        System.out.println("I run with four legs!");
    }

    public void makeNoise(){
        System.out.println("Bark!");
    }
    public static void main(String[] args) {
        Dog spike = new Dog();
        spike.makeNoise();
    }
}