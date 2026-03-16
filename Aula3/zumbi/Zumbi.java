package Aula3.zumbi;

public class Zumbi {
    double vida;
    String nome;
    boolean trasnferido;

    public double mostraVida(){
        return vida;
    }

    

    public void transfereVida(Zumbi zumbialvo, double quantidade){
        if (vida >= quantidade) {
            vida -= quantidade;
            zumbialvo.vida += quantidade;   
            trasnferido = true;   
        }
        else{
            trasnferido = false;
        }
    }
}
