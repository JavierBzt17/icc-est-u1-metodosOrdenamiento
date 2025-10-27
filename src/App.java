public class App {

    public static void main(String[] args) throws Exception {
        SortBubble sortBubble = new SortBubble();
        SortSelection sortSelection = new SortSelection();
        SortInsertion sortInsertion = new SortInsertion();
        int [] numeros = {10, 0, -5, 5, 15, 2};
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};

        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };

        /* System.out.println("Estudiante: Javier Barrezueta");
        System.out.println("Metodo Burbuja");
        System.out.println("Original");
        sortBubble.printArray(numeros);
        sortBubble.sortAscendente(numeros);
        System.out.println("\n Ascendente");
        sortBubble.printArray(numeros);
        sortBubble.sortDescendente(numeros);
        System.out.println("\n Descendente");
        sortBubble.printArray(numeros);
        System.out.println("\n");
        */

        /* System.out.println("Estudiante: Javier Barrezueta");

        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        sortSelection.printArray(numeros);
        sortSelection.sortAscendente(numeros);
        System.out.println("Ordenado Ascendente");
        sortSelection.printArray(numeros);
        System.out.println("Ordenado Descendente");
        sortSelection.sortDescendente(numeros);
        sortSelection.printArray(numeros);
        System.out.println("\n");
        */

        System.out.println("Estudiante: Javier Barrezueta");
        
        System.out.println("Metodo Inserion");
        System.out.println("Original");
        sortInsertion.printArray(numeros);
        sortInsertion.sortAscendente(numeros, false);
        System.out.println(" \n Ordenado Ascendente");
        sortInsertion.printArray(numeros);

        numeros = new int[]{10, 0, -5, 5, 15, 2};
        sortInsertion.sortDescendente(numeros);
        System.out.println(" \n Ordenado Descendente");
        sortInsertion.printArray(numeros);
        System.out.println("\n");


        System.out.println("Estudiante: Javier Barrezueta");
        System.out.println("Array de Nombres Original:");
        sortInsertion.printArray(nombres);
        sortInsertion.sortAscendente(nombres); 
        System.out.println("\nOrdenado por Nombre:");
        sortInsertion.printArray(nombres);
        System.out.println("\n");
        
        

        /* 
        System.out.println("\n Array de Nombres Original");
        sortInsertion.sortByName(nombres, true);
        */

        System.out.println("Estudiante: Javier Barrezueta");
        System.out.println("\nArray de Personas Original");
        sortInsertion.printArrayPersonas(personas);

        System.out.println("\nArray de Personas Ordenado por Nombre");
        sortInsertion.sortByName(personas, false); 
        sortInsertion.printArrayPersonas(personas);
        System.out.println("\n");



        
        personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };
        
        System.out.println("Estudiante: Javier Barrezueta");
        System.out.println("\nArray de Personas Original");
        sortInsertion.printArrayPersonas(personas);

        System.out.println("\nArray de Personas Ordenado por Edad");
        sortInsertion.sortByAge(personas, false); 
        sortInsertion.printArrayPersonas(personas);
        System.out.println("\n");
        

    }
}