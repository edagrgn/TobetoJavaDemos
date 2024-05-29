package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char grade= 'C';

        switch (grade){
            case 'A' :
                System.out.println("Excellent : Passed");
                break;
            case 'B':
            case 'C':
                System.out.println("Good : Passed");
                break;
            case 'D':
                System.out.println("Not Good  : Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Value");





        }
    }
}