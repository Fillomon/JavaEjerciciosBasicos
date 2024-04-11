
import java.util.Scanner;

public class JuegoAdivinar {

    public static void main(String[] args) {

        Scanner numIngresado=new Scanner(System.in);
        /*DECLARACION DE VARIABLES*/
        int intentosEchos=0;
        int numeroUsuario=0;
        int intentosTotal=5;

        /*GENERACIÓN NUMERO SECRETO*/
        int numeroSecreto= (int) (Math.random()*100+1);

        System.out.println("Secreto es: "+numeroSecreto);

        while (numeroUsuario != numeroSecreto) {
            System.out.println("Me indicas un número entre 1 y 100 por favor:");
            numeroUsuario = numIngresado.nextInt();
        
            if (numeroUsuario == numeroSecreto) {
                //Acertamos, fue verdadera la condición
                intentosEchos++;
                System.out.println("Acertaste, el número es: "+numeroUsuario+" Lo hiciste en "+intentosEchos);
                break;
            } else {
                if (numeroUsuario > numeroSecreto) {
                    System.out.println("El número secreto es menor");
                    
                } else {
                    System.out.println("El número secreto es mayor");
                    
                }
                //Incrementamos el contador cuando no acierta
                intentosEchos++;
                if (intentosEchos==intentosTotal) {
                    System.out.println("Perdiste!!, El número secreto es: "+numeroSecreto);
                    break;
                }

                //La condición no se cumplió
                //alert('Lo siento, no acertaste el número');
            }
        }
        
    }
}
