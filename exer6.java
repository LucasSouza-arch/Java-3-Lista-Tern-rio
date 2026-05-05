package Lista3_Se;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque sua idade:");
        int idade = sc.nextInt();
        if (idade <= 12) {
            System.out.println("INFANTIL");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("ADOLESCENTE");
        } else if (idade > 17 && idade <= 64) {
            System.out.println("ADULTO");
        } else if (idade > 64) {
            System.out.println("IDOSO");
        }

    }
}
