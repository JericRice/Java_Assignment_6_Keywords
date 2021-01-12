package com.mycompany.main;

public class Application {

    public static void main(String[] args) {

        float firstNumber, secondNumber;
        firstNumber = 390.98f;
        secondNumber = 76.982f;

        System.out.println(StaticClass.add(firstNumber,secondNumber));

        FinalClass finalclass = new FinalClass();
        System.out.println("This is a final constant " + finalclass.myConstant);

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.run();

    }



}
