/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatefactors;

import java.util.Scanner;

/**
 *
 * @author Cambaz-Monster
 */
public class CalculateFactors {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc;
    public static int x = 1;

    public static void factors(int n, int i) {
        if (i <= n) {
            
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            x++;
            factors(n, i + 1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int Number, i = 1;
        int n = 0;

        sc = new Scanner(System.in);

        System.out.println("Please Enter any number to Find Factors: ");
        Number = sc.nextInt();

        System.out.printf("Factors are : ");

        while (i <= Number) {
            if (Number % i == 0) {
                System.out.format(" %d  ", i);
                n++;
            }
            i++;
        }

        if (n == 2) {
            System.out.println("\n" + Number + " is a prime number ");
        }

        System.out.println("\nWith 1st method number of iteration  is : " + (i - 2));
        System.out.println("\nWith 2nd method number of iteration  is : " + x);

        factors(Number, 1);

    }
}
