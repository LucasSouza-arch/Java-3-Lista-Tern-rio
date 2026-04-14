package atividades.lista3;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque sua idade:");
        int idade = sc.nextInt();
        System.out.println((idade < 18) ? "menor de idade" : "maior de idade");
    }

}
