import java.util.Scanner;
public class Programa
{
    public static void main(String args[]){
        Matriz m;
        Scanner entrada = new Scanner(System.in);
        int o = 0;
        System.out.println("INTRODUZCA EL ORDEN DE LA MATRIZ QUE DESEA VISUALIZAR (ORDEN MAXIMO: 98)");
        o = entrada.nextInt();
        if(o < 0 || o > 98){
            System.out.println("EL ORDEN: "+ o + " INTRODUCIDO NO ES VALIDO");
        }else{
            m = new Matriz(o); 
            m.recorridoCaracol();
            System.out.println("Mostrando matriz de orden:"+ m.getOrden() +"\n" + m.mostrarMatriz()); 
            System.out.println("Diagonales:"+ "\n"+ m.diagonalesMatriz());
        }
        
    }
}
