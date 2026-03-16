package Aula3.zumbi;

public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Xico";
        z1.vida = 100;

        z2.nome = "Igor";
        z2.vida = 100;

        System.out.println("A vida do zumbi " + z1.nome + " é " + z1.mostraVida());
        z1.transfereVida(z2,100);
        System.out.println("A vida do zumbi " + z1.nome + " é " + z1.mostraVida());
        System.out.println("A vida do zumbi "+ z2.nome +" é " + z2.mostraVida());
        System.out.println("Retorno da função " + z1.trasnferido);
        //z1 = z2;

        System.out.println("A vida do zumbi " + z1.nome + " é " + z1.mostraVida());
        System.out.println("A vida do zumbi "+ z2.nome +" é " + z2.mostraVida());
    }
}
