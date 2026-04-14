package Lista3_Tenario;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Escreva a sua idade");
        idade = sc.nextInt();
        System.out.println((idade<16)?"nao pode votar":"Pode votar");

    }
}



