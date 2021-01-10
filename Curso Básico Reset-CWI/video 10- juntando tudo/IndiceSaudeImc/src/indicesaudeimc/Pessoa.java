
package indicesaudeimc;

/**
 *
 * @author michael
 */
public class Pessoa implements AcoesPessoa {
    /* Estas são as variáveis criadas privadas
     * tendo acesso somente os métodos acessores e
     * e modificadires get e set de cada um.
     */
    private String nome;
    private float peso;
    private float altura;
    private float imc;
    private int niveis;
    /* Abaixo fica o construtor e sempre que for criado um objeto
     * apartir desta classe, obrigatóriamente será informado
     * nome, peso e altura para criação do objeto.
     * imc e niveis vão ser calculados nos metodos da interface
     * AcoesVideo
     */
    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public int getNiveis() {
        return niveis;
    }

    public void setNiveis(int niveis) {
        this.niveis = niveis;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override/* esta é a sobre posição do método abstrato imc
              * lembrando que náo é possivel colocar parametros 
              * pois na AcoesVideo foi criado assim.
              * também existes outros tipos de polimorfismo utilizados
              * outro exemplo é a sobre Carga.
              */
    public float imc() {
        float c =this.getPeso() / (this.getAltura()*this.getAltura());
        this.setImc(c);
        return c;
    }

    @Override// esta é a sobre posição do método abstrato niveis
    public String niveis() {
         float c =this.getPeso() / (this.getAltura()*this.getAltura());
         int nivel;
         String status;
        if(c < 17){
            nivel= 0;
            this.setNiveis(nivel);
            status = ("Seu nivel é "+ nivel + " e você está em estado de magreza.\n Consulte seu medico e reveja sua alimentação.");
        }else if(c < 18.5 ){
            nivel= 1;
            this.setNiveis(nivel);
            status = ("Seu nivel é "+ nivel + " e você está em estado de abaixo do peso.\n Reveja sua alimentação.");
        }else if(c < 25){
            nivel= 2;
            this.setNiveis(nivel);
            status = ("Seu nivel é "+ nivel + " e você está em estado de peso normal.\n Parabéns! continue assim.");
        }else if(c < 30){
            nivel= 3;
            this.setNiveis(nivel);
            status = ("Seu nivel é "+ nivel + " e você está em estado de acima do peso.\n Diminua alimentação e faça exercícios");
        }else if(c < 35){
            nivel= 4;
            this.setNiveis(nivel);
            status = ("Seu nivel é "+ nivel + " e você está em estado de Obesidade grau I.\n Consulte seu médico.");
        }else if(c < 40){
            nivel= 5;
            this.setNiveis(nivel);
            status =("Seu nivel é "+ nivel + " e você está em estado de Obesidade grau II.\n Consulte com urgência seu médico.");
        }else{
            nivel= 6;
            this.setNiveis(nivel);
            status = ("Seu nivel é "+ nivel + " e você está em estado de Obesidade grau III.\n Alerta!! seu nível está muito elevado,vá o mais urgente possível ao médico.");
        }
        return status;
    }
    
}
