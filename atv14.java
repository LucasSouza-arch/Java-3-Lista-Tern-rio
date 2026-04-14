package atividades.lista3;

import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("digite sua nota");
        nota = sc.nextInt();
        System.out.println((nota => 7) ? "aluno aprovado" : "aluno reprovado");
    }
}