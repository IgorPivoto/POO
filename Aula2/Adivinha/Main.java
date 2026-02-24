package Adivinha;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int x = random.nextInt(10)+1;
        int y=0;
        do {
            System.out.println("Tente adivinhar o numero que foi gerado (1 a 10)");
            y = scanner.nextInt();
            if(x != y)
                System.out.println("Tente novamente");
        } while (x != y);
        System.out.println("Você Acertou!!!");
        scanner.close();
    }

}