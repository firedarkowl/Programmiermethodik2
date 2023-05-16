package Vorlesung4;

public class Person {

    private int alter = 0;

    /**
     *
     * Setzt das neue Alter der Person
     * @param neuesAlter das neue alter dieser Person, darf nicht kleiner 0 sein
     */
    public void setAlter(int neuesAlter){
        assert neuesAlter >= 0 : "Alter muss größer gleich 0 sein";
        alter = neuesAlter;
    }


}
