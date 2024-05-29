package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i=0 ;i<=10;i++){
            System.out.println(i);
        }

        for(int i=2 ;i<=24;i+=2){
            System.out.println(i);
        }
        System.out.println("For loop finished");

        int i=2;

        while(i<25){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While loop finished");
    }
}