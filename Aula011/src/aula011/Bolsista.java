
package aula011;


public class Bolsista extends Aluno{
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno");
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno bolsista");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
