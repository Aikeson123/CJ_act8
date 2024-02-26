import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        //Crear deck
        Deck deck = new Deck();

        //Agregar las 52 cartas
        deck.llenarDeck();

        //Interfaz en consola
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Acciones con el deck");
            System.out.println("1 = Shufle");
            System.out.println("2 = Head");
            System.out.println("3 = Pick");
            System.out.println("4 = Hand");
            System.out.println("5 = Mostrar cartas del deck");
            System.out.println("6 = Salir");
            System.out.println("--------------------------------------");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println(">Shufle");
                    deck.shuffle();
                    break;
                case "2":
                    System.out.println(">Head");
                    deck.head();
                    break;
                case "3":
                    System.out.println(">Pick");
                    deck.pick();
                    break;
                case "4":
                    System.out.println(">Hand");
                    deck.hand();
                    break;
                case "5":
                    System.out.println(">Cartas del deck:");
                    for (Card card : deck.getCartas()) {
                        System.out.println(card);
                    }
                    break;
                case "6":
                    System.out.println("Cerrando programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
            }

        }
    }
}
