package Ejercicio_08;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Usuario usuario_01 = new Usuario("Christian Leiva", "email_falso@hotmail.com");
        Documento doc_01 = new Documento("Contrato Puesto DEV", "bases y condiciones...", "a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e", usuario_01);
        
        System.out.println(doc_01.toString());
        
        
       
       
    }

}
