package atividades.lista3;

import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("Coloque um ano:");
        ano = sc.nextInt();
        System.out.println((ano % 4 == 0) && (ano % 100 != 0) ? "é ano bissexto" : "é normal");

    }
}
