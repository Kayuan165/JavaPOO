
package projetofinal;


public class ProjetoFinal {


    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[3];
        Visualizacao vis[] = new Visualizacao [2];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");
        
        g[0] = new Gafanhoto("Kayuan",19,"M","kayuan");
        g[1] = new Gafanhoto("Clayton",58,"M","clay");
        g[2] = new Gafanhoto("Maria",12,"F","Mar1a");
        
        vis[0] = new Visualizacao(g[0],v[0]); 
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(92.0f);
        
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        
        /*System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());*/
    }
    
}
