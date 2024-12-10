package Losson1;

import java.util.Scanner;

public class BitwisweOperator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");
        Integer a = Integer.valueOf(myObj.nextLine());

        System.out.println("Enter b number");
        Integer b = Integer.valueOf(myObj.nextLine());

        myObj.close();


        if (a == 3 && b == 3){
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Both numbers are not equal");
        }

        // & (AND)
        System.out.println(a & b); // 1 (0001 & 0011 = 0001)

        // | (OR)
        System.out.println(a | b); // 7 (0001 | 0011 = 0011)

        // ^ (XOR)
        System.out.println(a ^ b); // 6 (0001 ^ 0011 = 0010)

        // ~ (NOT)
        System.out.println(~a); // -6 (-0001 ~ 1110 = 1111 1110)

        // << (Left Shift)
    }
}
