package atividades.lista3;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preço;
        System.out.println("Coloque o preço do produto:");
        preço = sc.nextDouble();
        double desconto = (preço < 100) ? preço * 0.1 : preço;
        System.out.println("o preço do produto foi de " +desconto);
    }
}
