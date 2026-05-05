package Lista3_Se;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Escreva a temperatura atual");
        temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("Temperatura baixa");
        } else if (temp > 15 && temp < 25) {
            System.out.println("Temperatura agradavel");
        } else System.out.println("Temperatura alta");
    }
}

