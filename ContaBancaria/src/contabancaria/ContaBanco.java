/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("---------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------");
    }
    
    public void ContaBanco(){
        
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void abrirConta(String t){
          this.setTipo(t);
          this.setStatus(true);
          
          if( t == "CC"){
              this.setSaldo(50);
          }else if( t == "CP"){
              this.setSaldo(150);
          }
          System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta(){
        
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta em debito");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso! ");
        }
        
    }
    
    public void depositar(float v){
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depositar");
        }
        
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Imopssivel sacar");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        
        if( this.getTipo() == "CC"){
            v = 12;
        }else if ( this.getTipo() == "CP"){
            v = 20;
        }
        if( this.getStatus()){
                this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "  + this.getDono());
            }else{
                System.out.println("Impossivel pagar com a conta fechada");
            }
        
    }
    
    public int getnumConta(){
        return this.numConta;
    }
    
    public void setnumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
}
