package com.startjava.lesson_2_3.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setGender("Male");
        wolfOne.setName("Bond");
        wolfOne.setWeight(12.5f);
        wolfOne.setAge(5);
        wolfOne.setColor("Grey");
        System.out.println("gender = " + wolfOne.getGender());
        System.out.println("name = " + wolfOne.getName());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("color = " + wolfOne.getColor());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}