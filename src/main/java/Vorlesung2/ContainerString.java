package Vorlesung2;

//hier konkrete Implementierung von dem Interface incl konkreter Verwendung des Generics (setze also schon was ein)
public class ContainerString implements HatGetter<String> {
    private String element;
    public ContainerString(){

    }

    @Override
    public String get(){
        return element;
    }

}
