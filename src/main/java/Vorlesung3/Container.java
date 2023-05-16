package Vorlesung3;

//arbeitet weiter mit dem Generic
public class Container<T> implements HatGetter<T> {
    private T element;
    public Container(){

    }

    @Override
    public T get(){
        return element;
    }

}
