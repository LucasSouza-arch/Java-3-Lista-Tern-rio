package Lista3_Tenario;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Escreva dois numeros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println((num1==num2)?"Os numeros sao iguais":"Os numeros sao diferentes");
    }
}

