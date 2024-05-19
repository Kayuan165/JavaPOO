/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Kayuan
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setnumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        
        ContaBanco p2 = new ContaBanco();
        p2.setnumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
        p1.fecharConta();    
    }
    
}
