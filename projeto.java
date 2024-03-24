package project;

import java.util.Scanner;

public class projeto {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, x;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        x = num1 * num2;

        System.out.println("O valor de x é: " + x );
    }
}