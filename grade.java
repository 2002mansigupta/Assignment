package anudip;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        //Write a program that takes a score as input and assigns a letter grade (A, B, C, D, F) based on the score using if-else if logic.
      /*  90 and above	A
        80 to 89	B
        60 to 79	C
        33 – 59	D
        below 33	*/
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter score between 1 to 100 ");
        int score=sc.nextInt();
        if(score>=90 && score<=100){
            System.out.println(" A grade ");}
        else if(score>=80 && score<=89){
            System.out.println(" B grade ");}
        else if (score>=60 && score<70){
            System.out.println(" C grade ");}
        else if (score>=33 && score<=59){
            System.out.println(" D grade ");}
        else if (score>=0 && score<=33){
            System.out.println("  E grade ");}


    }
}
