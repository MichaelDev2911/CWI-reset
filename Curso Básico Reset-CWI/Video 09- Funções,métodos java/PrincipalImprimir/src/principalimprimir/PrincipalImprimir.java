
package principalimprimir;

/**
 *
 * @author michael
 */
public class PrincipalImprimir {

   
    public static void main(String[] args) {
       Imprimir i = new Imprimir(); // classe instanciada.
        System.out.println(" Imprimiu o valor " + i.imprimir(5));
        /* acima objeto i da classe imprimir
         * chamando o método imprimir com um valor inteiro
         * como parâmetro.*/
    }
    
}
