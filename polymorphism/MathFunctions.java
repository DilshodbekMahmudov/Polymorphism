package com.lesson.polymorphism;

public class MathFunctions {


    int add(int a,int b){
        return a+b;

    }
    int sub(int a,int b){
        return a-b;
    }

    int multiply(int a,int b){
        return a*b;
    }

    int div(int a,int b){
        return a/b;

    }

    int abs(int a){
        return Math.abs(a);
    }

    int pow(int a){
       return a*a;
    }

    public static void main(String[] args) {

        MathFunctions mathFunctions = new MathFunctions();

        System.out.println(mathFunctions.add(3,5));
        System.out.println(mathFunctions.sub(7,5));
        System.out.println(mathFunctions.multiply(2,5));
        System.out.println(mathFunctions.div(10,5));
        System.out.println(mathFunctions.abs(-3));
        System.out.println(mathFunctions.pow(5));
    }




}
