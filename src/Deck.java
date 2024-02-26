import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
public class Deck {
    // Atributos
    private List<Card> cartas;

    // Constructor
    public Deck() {
        this.cartas = new ArrayList<>();
    }

    // Funcion para llenar deck con las 52 cartas
    public void llenarDeck() {
        String[] palos = {"Treboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            for (int i = 0; i < valores.length; i++) {
                cartas.add(new Card(palo, colores[asignarColor(palo)], valores[i]));
            }
        }
    }

    // Sub-funcion para determinar si la carta sera roja o negra
    private int asignarColor(String palo) {
        switch (palo) {
            case "Corazones":
            case "Diamantes":
                return 1;
            default:
                return 0;
        }
    }

    // Funcion para imprimir carta
    public List<Card> getCartas() {
        return cartas;
    }


    // --> Metodos del deck

    // shuffle: mezclar deck
    public void shuffle() {
        //Usar el shufle de libreria collections
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck");
    }

    // head: mostrar y descartar primera carta
    public Card head() {
        //Revisar si hay cartas
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas");
            return null;
        }

        // Seleccionar carta del indice 0
        Card primeraCarta = cartas.remove(0);

        // Mostrar carta
        System.out.println(primeraCarta);
        System.out.println("Quedan " + cartas.size() + " cartas");
        return primeraCarta;
    }

    // pick: mostrar carta al azar
    public Card pick() {
        //Revisar si hay cartas
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas");
            return null;
        }

        // Generar numero al azar de 0 al numero actual de cartas
        Random random = new Random();
        int numRandom = random.nextInt(cartas.size());

        // Eliminar carta del indice obtenido
        Card cartaRandom = cartas.remove(numRandom);

        // Mostrar la carta
        System.out.println(cartaRandom);
        System.out.println("Quedan " + cartas.size() + " cartas");

        return cartaRandom;
    }

    // hand: mostrar 5 cartas
    public List<Card> hand() {
        // Revisar si hay suficientes cartas
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas");
            return null;
        }

        // Crear arreglo de cartas
        List<Card> hand = new ArrayList<>();

        // Agregar cartas al arreglo y eliminarlas del deck
        for (int i = 0; i < 5; i++) {
            hand.add(cartas.remove(0));
        }

        // Mostrar las cartas
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("Quedan " + cartas.size() + " cartas");

        return hand;
    }








}
