public class SortSelection {

    public SortSelection(){

    }

    public void sortAscendente(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;
            for (int j = i+1; j <numeros.length; j++){
                if (numeros[j] < numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (i!= indiceMenor){
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
            }
        }
    }

    public void sortDescendente(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;
            for (int j= i +1; j < numeros.length; j++){
                if (numeros[j] > numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (i!= indiceMenor){
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;
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
        System.out.println("]");
    }
    
}
