package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] students = new String[4];
        students[0] ="Engin";
        students[1]="Eda";
        students[2]="Rumeysa";
        students[3]="Derin";

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        for(String student:students){
            System.out.println(student);
        }
    }
}