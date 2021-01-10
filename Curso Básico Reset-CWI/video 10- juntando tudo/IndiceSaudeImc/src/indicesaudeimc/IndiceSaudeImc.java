
package indicesaudeimc;

/**
 *
 * @author michael
 */
public class IndiceSaudeImc {

 
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Michael",78.0f,1.72f);
        System.out.println(p.imc());
        System.out.println(p.niveis());
    }
    
}
