package Vorlesung2;

public class Knoten <T> {
    private T element;
    private Knoten<T> links;
    private Knoten<T> rechts;

    public Knoten (T element) {
        this.element = element;
    }

    public Knoten getLinks() {
        return links;
    }

    public Knoten getRechts() {
        return rechts;
    }

    public void setLinks(Knoten<T> links) {
        this.links = links;
    }

    public void setRechts(Knoten<T> rechts) {
        this.rechts = rechts;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
