
package aula04;


public class Caneta {
    
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    
    public Caneta(String m, String c, float p){ //este é o meteodo construtor
        
        this.modelo = m;
        this.ponta = p;
        this.cor = c;          
        this.Tampar();
    }
    
    public void Tampar(){
        this.tampada = true;
    }
    
    public void Destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
    return this.modelo;
    }
    
    public void SetModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void SetPonta(float p){
        this.ponta = p;
    }
    
    public void Status(){
        System.out.println("SOBRE A CANETA ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
    }
    
}
