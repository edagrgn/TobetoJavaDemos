package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1=20;
        int num2=25;
        int num3=2;

        int greaterNum = num1;


       if(num1>num2){
           greaterNum=num1;
       }
       if (num2>num3) {
           greaterNum=num2;
       }
       else
           greaterNum=num3;


        System.out.println("the greatest number is "+greaterNum);
    }

}