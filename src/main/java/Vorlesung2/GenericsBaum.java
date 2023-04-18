package Vorlesung2;

public class GenericsBaum {

    public static void main(String[] args) {

        Knoten<Integer> wurzel = new Knoten(1);
        wurzel.setLinks(new Knoten<Integer>(0));
        //geht nicht weil er dann als T dann nur Integers akzeptiert in diesem Fall
        //wurzel.setRechts(new Knoten<>("zwei"));


    }
}
