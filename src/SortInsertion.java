public class SortInsertion {

    public SortInsertion(){
    
    }


    public void sortAscendente(int[] numeros){
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];
            while (j >= 0 && numeros[j] > aux ){
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
    }

    public void sortDescendente(int[] numeros){
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];
            while (j >= 0 && numeros[j] < aux ){
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
    }




    public void sortAscendente(int[] numeros, boolean pasos){
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];
            if (pasos){
                System.out.println("i:" + i + ",j:" + j + ", aux:" + aux);
            }
            while (j >= 0 && numeros[j] > aux ){
                if(pasos)
                    System.out.println("Compara aux:" + aux + "con numeros ["+ j +"]:" + numeros[j]);

                numeros[j + 1] = numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if(pasos)
                    System.out.println("Mueve numeros[" + (j + 1) +"] a numeros[" + (j + 2) +"]");
            }
            numeros[j + 1] = aux;
            if (pasos){
                System.out.println("Insertas aux:" + aux + "en la posicion" + (j + 1));
                System.out.println("Estado actual");
                printArray(numeros);
            }
        }
    }


    public void sortAscendente(String[] nombres){
        for (int i = 1; i < nombres.length; i++) {
            int j = i - 1;
            String aux = nombres[i];
            while (j >= 0 && nombres[j].compareTo(aux) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = aux;
        }
    }
    

    public void sortByName(Persona[] personas, boolean pasos) {
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux.getName());
            }
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                if (pasos)
                    System.out.println("Compara aux: " + aux.getName() + " con nombres [" + j + "]: " + personas[j].getName());
                
                personas[j + 1] = personas[j];
                
                if (pasos) 
                    printArrayPersonas(personas);
                
                j--;
                
                if (pasos) 
                    System.out.println("Mueve nombres [" + (j + 1) + "] a nombres [" + (j + 2) + "]");
            }
            personas[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux.getName() + " en la posicion " + (j + 1));
                System.out.print("Estado actual");
                printArrayPersonas(personas);
            }
        }
    }

    public void sortByAge(Persona[] personas, boolean pasos) {
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            if (pasos) {
                System.out.println("i:" + i + ", j:" + j + ", aux:" + aux.getAge());
            }
            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                if (pasos) {
                    System.out.println("Compara aux:" + aux.getAge() + " con edad [" + j + "]:" + personas[j].getAge());
                }
                personas[j + 1] = personas[j];
                if (pasos) {
                    printArrayPersonas(personas);
                }
                j--;
                if (pasos) {
                    System.out.println("Mueve edad[" + (j + 1) + "] a edad[" + (j + 2) + "]");
                }
            }
            personas[j + 1] = aux;
            if (pasos) {
                System.out.println("Insertas aux:" + aux.getAge() + " en la posicion " + (j + 1));
                System.out.print("Estado actual");
                printArrayPersonas(personas);
            }
        }
    }


    public void printArrayPersonas(Persona[] personas){
        for (int i = 0; i < personas.length; i++){
            System.out.println("Nombre: " + personas[i].getName() + ", Edad: " + personas[i].getAge());
        }
    }

    public void printArray(Integer[] edad){
        System.out.print("[");
        for (int i = 0; i < edad.length; i++){
            System.out.print(edad[i]);
            if (i < edad.length){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    
    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            if (i < numeros.length){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }



    public void printArray(String[] nombres){
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i]);
            if (i < nombres.length){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
