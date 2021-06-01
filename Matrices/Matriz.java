public class Matriz
{
    private int[][] matriz;
    private boolean[][] matrizAux;
    Matriz(int orden){
        if(orden > 0){
            matriz = new int[orden][orden];
            matrizAux = new boolean[orden][orden];
        }
    }
    public void recorridoCaracol(){
        int i = 0;
        int j = 0;
        int tope = matriz.length - 1;
        int bajo = 0;
        int cont = 1;
        while(cont <= Math.pow(matriz.length, 2.0)){
            while(j <= tope){
                matriz[i][j]= cont;
                cont++;
                j++;
            }
            j--;
            i++;
            while(i <= tope){
                matriz[i][j]= cont;
                cont++;
                i++;
            }
            i--;
            j--;
            tope--;
            while(j >= bajo){
                matriz[i][j] = cont;
                cont++;
                j--;
            }
            j++;
            i--;
            if(bajo == 0){
                bajo++; 
            }else {
                bajo++;
            }
            while(i >= bajo){
                matriz[i][j] = cont;
                cont++;
                i--;
            }
            i++;
            j++;
        }
    }
    public String diagonalesMatriz(){
        String muestra = "";
        int f = matrizAux.length - 1;
        int c = 0;
        while( f >= 0 && c < matriz[0].length){
            matrizAux[f][c] = true;
            f--;
            c++;
        }
        f = 0;
        c = 0;
        while(f < matriz.length && c < matriz[0].length){
            matrizAux[f][c] = true;
            f++;
            c++;
        }
        for(int i = 0 ;i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[0].length ; j++){
                if(matrizAux[i][j]){
                  if(matriz[i][j] < 10){
                     muestra = muestra + "  "+ matriz[i][j] + " ";
                  }else{
                     muestra = muestra + " "+ matriz[i][j] + " ";
                    }
                }else{
                    muestra = muestra + " _ ";
                }
            }
            muestra = muestra + "\n";
        }
        return muestra;
    }
    public String mostrarMatriz(){
        String muestra = "";
        for(int i = 0 ;i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[0].length ; j++){
                if(matriz[i][j] < 10){
                  muestra = muestra + "  " + matriz[i][j] + " ";
                }else if(matriz[i][j] >= 10 && matriz[i][j] < 100){
                    muestra = muestra +" " + matriz[i][j] + " ";
                }else{
                    muestra = muestra + matriz[i][j] + " ";
                }
            }
            muestra = muestra + "\n";
        }
        return muestra;
    }
}
