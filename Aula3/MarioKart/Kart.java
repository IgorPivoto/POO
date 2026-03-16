package Aula3.MarioKart;

public class Kart {
    
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulando");
    }
    
    void soltarTurbo()
    {
        System.out.println("Soltando o Turbo");
    }

    void fazerDrift(){
        System.out.println("Fazendo Drift");
    }
}

