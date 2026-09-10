package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 6 de la unidad 2
 * Solicitar al usuario 10 números y contar los positivos, negativos y los ceros
 * @author Christian Leiva
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cont_positivos = 0, cont_negativos = 0, cont_ceros = 0;
       
       for(int i = 0; i < 10; i ++){
           System.out.println("Ingrese el numero "+(i+1)+"/10");
           int num = Integer.parseInt(sc.nextLine());
           if(num > 0){
               cont_positivos += 1;
           }else if(num < 0){
               cont_negativos += 1;
           }else{
               cont_ceros += 1;
           }
       }
       
       System.out.println("Resultados:\n\tPositivos: "+cont_positivos+".\n\tNegativos: "+cont_negativos+".\n\tCeros: "+cont_ceros+".");
    }

}
