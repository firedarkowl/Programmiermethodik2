package Vorlesung5;

import java.util.Comparator;

public class VornamenVergleicher implements Comparator<Eintrag> {

    @Override
    public int compare(Eintrag e1, Eintrag e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }


}

