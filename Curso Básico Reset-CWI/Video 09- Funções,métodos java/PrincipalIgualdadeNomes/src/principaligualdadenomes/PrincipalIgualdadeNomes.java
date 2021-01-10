
package principaligualdadenomes;

/**
 *
 * @author michael
 */
public class PrincipalIgualdadeNomes {

    public static void main(String[] args) {
        Nomes mesmoNome= new Nomes();// objeto mesmoNome do tipo(da classe)Nomes
        // chamando o método verificar e mostrando o retorno na tela.
        System.out.println(mesmoNome.verificar("cwi", "cwi"));
         System.out.println(mesmoNome.verificar("cwi", "reset"));
    }
    
}
