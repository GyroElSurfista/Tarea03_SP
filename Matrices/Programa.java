public class Programa
{
    public static void main(String args[]){
        Matriz m;
        m = new Matriz(5);
        m.recorridoCaracol();
        System.out.println("Mostrando matriz de orden 5:"+ "\n" + m.mostrarMatriz());
        System.out.println("Diagonales:"+ "\n"+ m.diagonalesMatriz());
        //****************************************
        m = new Matriz(10);
        m.recorridoCaracol();
        System.out.println("Mostrando matriz de orden 10:"+ "\n" + m.mostrarMatriz());
        System.out.println("Diagonales:"+ "\n"+ m.diagonalesMatriz());
        //****************************************
        m = new Matriz(31); // maximo orden imprimible de manera decente.
        m.recorridoCaracol();
        System.out.println("Mostrando matriz de orden 31:"+ "\n" + m.mostrarMatriz());
        System.out.println("Diagonales:"+ "\n"+ m.diagonalesMatriz());
        //****************************************
    }
}
