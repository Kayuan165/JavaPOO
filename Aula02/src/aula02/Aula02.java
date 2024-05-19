
package aula02;

public class Aula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        c2.carga = 50;
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        
        c2.rabiscar();
        c2.status();
        c2.tampar();
    }
    
}
