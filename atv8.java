package atividades.lista3;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero");
        n1=sc.nextInt();
        System.out.println((n1 > 0) ? "positivo" : "negativo");
    }
}
