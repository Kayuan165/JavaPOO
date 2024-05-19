/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioufc;


public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitórias;
    private int empate;
    private int derrotas;
    
    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitórias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpate());
        System.out.println("----------------------------------------");
    }
    public void status(){
        System.out.println("-------------");
        System.out.println(this.getAltura());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitórias());
        System.out.println(this.getVitórias() + " Vitórias");
        System.out.println(this.getDerrotas() + "Derrotas");
        System.out.println(this.getEmpate() + "Empates");
        System.out.println("-------------");
    }
    public void ganharluta(){
       this.setVitórias(this.getVitórias() + 1);
    }
    public void perderluta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarluta(){
        this.setEmpate(this.getEmpate() + 1);
    }

    public Lutador(String no, String na, int id, float al, 
                    float pe, int vi, int em, int de) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
       this.setPeso(pe);
        this.vitórias = vi;
        this.empate = em;
        this.derrotas = de;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.5 ){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitórias() {
        return vitórias;
    }

    public void setVitórias(int vitórias) {
        this.vitórias = vitórias;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    
    
}
