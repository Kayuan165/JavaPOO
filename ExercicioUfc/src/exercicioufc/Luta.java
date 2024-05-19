
package exercicioufc;

import java.util.Random;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarluta(Lutador l1,Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor =  aleatorio.nextInt(3);
            System.out.println("==== RESULTADO ====");
            
            switch(vencedor){
                case 0:
                    System.out.println("A luta empatou!");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1:
                    System.out.println("O desafiado " + this.getDesafiado() + " ganhou a luta");
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;
                case 2:
                    System.out.println("O desafiante " + this.getDesafiante() + " ganhou a luta");
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                    break;
            }
        }else{
            System.out.println("Essa luta não pode acontecer! ");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }
    
    
}
