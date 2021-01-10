/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Apresentar {
    //variáveis que serão usadas no construtor para apresentar os dados.
    private String nomeCompleto;
    private String apelido;
    private int idade;
    private String dataNascimento;
    private String localNascimento;
    private float altura;
    private String trabalho;
    public String ap;
    
// construtor 
    public Apresentar(String n, String a, int i, String d,String l ,float al, String t){
        
        this.nomeCompleto = n;
        this.apelido = a;
        this.idade = i;
        this.dataNascimento = d;
        this.localNascimento = l;
        this.altura = al;
        this.trabalho = t;
    }
    public void apresentacao(){
    String ap = "Meu nome é " + this.getNomeCompleto() + "(sou conhecido(a) como " + this.getApelido()+
            ") e tenho  " + this.getIdade() + " anos. Nasci no dia "+
            this.getDataNascimento() + ", na cidade de "+ this.getLocalNascimento() +
            ". Tenho " + this.getAltura() + "m de altura e atualmente estou trabalhando "+ this.getTrabalho();
    
    }
// metodos getters e setters

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }


    
}
