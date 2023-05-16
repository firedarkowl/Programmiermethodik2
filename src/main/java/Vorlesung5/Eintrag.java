package Vorlesung5;

/**
 * In dieser Klasse sind Beispiele für Comparable
 */

public class Eintrag implements Comparable<Eintrag> {

    public String getFirstName() {
        return firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    private String lastName;

    public int getNumber() {
        return number;
    }

    private int number;

    @Override
    public int compareTo(Eintrag e) {
        return lastName.compareTo(e.lastName);
    }


}
