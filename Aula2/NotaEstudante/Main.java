package NotaEstudante;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a NPA do estudante:");
        float npa = scanner.nextFloat();

        if (npa >= 60){
            System.out.println("O estudante foi aprovado!");
        } else {
            System.out.println("O estudante foi reprovado!");
            System.out.println("Entre com a nota da NP3:");
            float np3 = scanner.nextFloat();
            float media = (npa + np3) / 2;
            if (media >= 50){
                System.out.println("O estudante foi aprovado na NFA!");
            } else {
                System.out.println("O estudante foi reprovado na NFA!");
            }
        }

        scanner.close();
    }
}