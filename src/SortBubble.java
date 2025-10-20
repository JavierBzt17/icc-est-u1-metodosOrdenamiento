public class SortBubble {



    public static void SortBubble (int []numeros){
    }

    public void sortAscendente (int[] numeros){
        int numTam = numeros.length;
        for (int i = 0; i < numTam-1; i++) {
            for (int j = i + 1; j < numTam-1-i; j++){
                if(numeros[j] > numeros[j+1]){
                    int tem = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = tem;
                }
            }  
        }
    }

    public void sortDescendente (int[] numeros){
        int numTam = numeros.length;
        for (int i = 0; i < numTam-1; i++) {
            for (int j = i + 1; j < numTam-1-i; j++){
                if(numeros[j] < numeros[j+1]){
                    int tem = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = tem;
                }
            }  
        }
    }
    
    public static void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            if (i < numeros.length -1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
