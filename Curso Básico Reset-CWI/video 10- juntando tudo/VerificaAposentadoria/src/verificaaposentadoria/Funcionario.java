/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaaposentadoria;

/**
 *
 * @author michael
 */
public class Funcionario {
    public String nome;
    private int idade;
    private int anosTrabalho;
    public String lista1= "Rhoger";
    public String lista2= "Cléverson";
    public String lista3= "Gleyberto";
    public String lista4= "Nádio";
    public String lista5= "Rosimeri";
    public String lista6= "Regislane";
    public String lista7= "Agripino";
    public String lista8= "Wellison";
    public String mensagem;
    
    
    

    public Funcionario(String nome, int idade, int anosTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.anosTrabalho = anosTrabalho;
    
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnosTrabalho() {
        return anosTrabalho;
    }

    public void setAnosTrabalho(int anosTrabalho) {
        this.anosTrabalho = anosTrabalho;
    }

    
    public void verificarAposentadoria(){
            String verificar = this.getNome();
           boolean funcionario;
           
            if (verificar.equals(this.lista1) ||verificar.equals(this.lista2)||
                verificar.equals(this.lista3) ||verificar.equals(this.lista4)||
                verificar.equals(this.lista5) ||verificar.equals(this.lista6)||
                verificar.equals(this.lista7) ||verificar.equals(this.lista8)){
                funcionario = true;
                       
                boolean porIdade = this.getIdade() >=65;
                boolean porTempoTrabalho = this.getAnosTrabalho() >=30;
                boolean porIdadeComTempoServico = this.getIdade() >=60 && this.getAnosTrabalho() >=25;
                                

                if(porIdade || porTempoTrabalho || porIdadeComTempoServico){
                     this.mensagem = ("Parabéns! Você ja pode sair de ferias eternas :)");
                }else{
                     this.mensagem = ("Infelismente ainda falta algum tempo. :(");
                }
            
                
            
            }else{
                System.out.println("Você não é funcionário, verifique a digitação.");
            }
           
        

        System.out.println(this.mensagem);
   }
}
