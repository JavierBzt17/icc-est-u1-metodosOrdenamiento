public class App {

    public static void main(String[] args) throws Exception {
        SortBubble sortBubble = new SortBubble();
        SortSelection sortSelection = new SortSelection();
        int [] numeros = {10, 0, -5, 5, 15, 2};
        /* 
        sortBubble.printArray(numeros);
        sortBubble.sortAscendente(numeros);
        System.out.println("\n Ascendente");
        sortBubble.printArray(numeros);
        System.out.println("\n");

        sortBubble.printArray(numeros);
        sortBubble.sortDescendente(numeros);
        System.out.println("\n Descendente");
        sortBubble.printArray(numeros);
        */

        System.out.println("Estudiante: Javier Barrezueta");

        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        sortSelection.printArray(numeros);
        sortSelection.sortAscendente(numeros);
        System.out.println("Ordenado Ascendente");
        sortSelection.printArray(numeros);
        System.out.println("Ordenado Descendente");
        sortSelection.sortDescendente(numeros);
        sortSelection.printArray(numeros);


    }
}
