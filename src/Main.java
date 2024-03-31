import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu() {   
        Scanner scanner = new Scanner(System.in);
        String opcion;

        //Crear deck
        Deck deck = new Deck();

        //Agregar las 52 cartas
        deck.llenarDeck();

        //Interfaz en consola
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opción:");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("5 Mostrar cartas del deck");
            System.out.println("6 Salir");
            System.out.println("--------------------------------------");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    deck.shuffle();
                    break;
                case "2":
                    deck.head();
                    break;
                case "3":
                    deck.pick();
                    break;
                case "4":
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
                    System.out.println("Opción no válida");
            }

        }
    }
}

