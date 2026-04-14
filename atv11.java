package Lista3_Tenario;

import java.util.Scanner;

public class exer11 {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num,num2;
    System.out.println("Escreva um numero");
    num=sc.nextInt();
    num2=num%5;
    System.out.println((num2==0)?"Esse numero e divisivel por 5":"Esse numero nao e divisivel por 5");
    }
}

