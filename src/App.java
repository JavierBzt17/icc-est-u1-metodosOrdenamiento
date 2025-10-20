public class App {

    public static void main(String[] args) throws Exception {
        SortBubble sortBubble = new SortBubble();
        int [] numeros = {10, 0, -5, 5, 15, 2};

        sortBubble.printArray(numeros);
        sortBubble.sortAscendente(numeros);
        System.out.println("\n Ascendente");
        sortBubble.printArray(numeros);

        System.out.println("\n");

        sortBubble.printArray(numeros);
        sortBubble.sortDescendente(numeros);
        System.out.println("\n Descendente");
        sortBubble.printArray(numeros);
    



    }
}
