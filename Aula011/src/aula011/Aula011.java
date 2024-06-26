
package aula011;

public class Aula011 {

    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setNome("Kayuan");
        v1.setIdade(19);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        a1.PagarMensalidade();
        
        b1.PagarMensalidade();
        
    }
    
}
