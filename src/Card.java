public class Card {
    // Atributos
    private String palo;
    private String color;
    private String valor;

    // Constructor
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    //Getters
    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    // Imprimir mensaje
    @Override
    public String toString() {
        return "{" + palo + "}" + " {" + color + "}" + " {" + valor + "}";
    }

}
