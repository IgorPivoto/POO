package SalaAula;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero de alunos matriculados na materia C06:");
        int numeroAlunos = scanner.nextInt();

        switch (numeroAlunos) {
            case 10,20:
                System.out.println("A sala sera I-16");
                break;
            case 30:
                System.out.println("A sala sera I-22");
                break;
            default:
                System.out.println("O numero de alunos deve ser, 10, 20 ou 30");
                break;
        }

        scanner.close();
    }

}
