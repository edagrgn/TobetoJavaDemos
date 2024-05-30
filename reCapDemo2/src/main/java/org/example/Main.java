package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] myList= {1.6, 4.4, 2.6, 3.5};
        double total =0;
        double biggestNum= myList[0];


        for(double numbers: myList){
            if( biggestNum<numbers){
                biggestNum=numbers;
            }
            total=total+numbers;

            System.out.println(numbers);
        }
        System.out.println(total);
        System.out.println(biggestNum);



    }
}