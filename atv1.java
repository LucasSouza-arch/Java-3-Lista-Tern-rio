package atividades.lista3;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque seu salario:");
        int salario = sc.nextInt();
        System.out.println((salario < 2000) ? "salario baixo" : "salario alto");

    }
}