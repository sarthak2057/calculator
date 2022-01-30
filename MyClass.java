

import java.util.Scanner;


public class MyClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        Calculation calculate = new Calculation();

        System.out.print("Enter first number- ");
        int num1= sc.nextInt();
        calculate.setNum1(num1);

        System.out.print("Enter Second number-");
        int num2 = sc.nextInt();
        calculate.setNum2(num2);

        System.out.print("Enter the operation you want to execute" +
                "1 for addition \n2 for subtraction \n3 for multiplication \n4 for division \n");
        int operation = sc.nextInt();
        System.out.println("Ans: "+calculate.calculation(operation));

    }



}