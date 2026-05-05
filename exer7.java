package Lista3_Se;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Escreva 3 numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O maior numero e o " + num1);
        } else if (num2 > num3) {
            System.out.println("O maior numero e o " + num2);
        } else {
            System.out.println((num3 > num1));
            System.out.println("O maior numero e o " + num3);
        }
    }
}
