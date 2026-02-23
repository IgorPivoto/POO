package TraillerZe;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Olá, Trailler do Ze!");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de lanches da hora 1:");
        int lanche1 = scanner.nextInt();
        System.out.println("Digite a quantidade de lanches da hora 2:");
        int lanche2 = scanner.nextInt();
        System.out.println("Digite a quantidade de lanches da hora 3:");
        int lanche3 = scanner.nextInt();
     
        int total = lanche1 + lanche2 + lanche3;    
        float media = (float) total / 3;
        
        System.out.println("O total de lanches é: " + total);
        System.out.println("A média de lanches é: " + media);

        scanner.close();
    }

}
