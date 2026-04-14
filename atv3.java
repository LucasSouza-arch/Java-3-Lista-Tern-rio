package atividades.lista3;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        System.out.println("Coloque a temperatura:");
        temp = sc.nextDouble();
        System.out.println((temp < 40) ? "temperatura dentro dos limites normais" : "temperatura extremamente alta");

    }
}
