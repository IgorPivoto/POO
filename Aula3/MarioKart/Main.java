package Aula3.MarioKart;

public class Main {
    
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome = "Xico";
        p2.nome = "Igor";

        kart1.piloto = p2;
        kart2.piloto = p1;
        
        kart1.motor.cilindradas = "100";
        kart2.motor.cilindradas = "100";
    }

}
