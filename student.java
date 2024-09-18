package anudip;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        //Write a Java program to check if a number is even or odd using if-else statements.
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(" even number ");
        }
        else
            System.out.println(" odd number ");


    }
}
