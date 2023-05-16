package Vorlesung5;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args){

        /*===Beispiel===*/

        //So wird ein Stream erstellt, import nicht vergessen
        //das hier ist ein Stream von Strings
        Stream<String> name = Stream.of("Merle", "Tim", "Jonas", "Lotta");

        //Verarbeitung eines Streams
        //in der Form funktioniert peek nicht, es möchte, dass wir irgendwas mit den Daten gemacht haben
        //das machen wir in der Terminierung
        //name.peek(System.out::println);

        name = name.peek(System.out::println);

        //Terminierung
        name.forEach(str -> {});

        /*===anderes Beispiel===*/

        Stream<String> name2 = Stream.of("Merle", "Tim", "Mama", "Lotta");
        //hier einfach den übergebenen String auf der Konsole ausgeben
        Consumer<String> peekAusgabe = string -> {System.out.println(string);};

        //Streamverarbeitung
        name2.peek(peekAusgabe)
                //Mit Lambda filten wir uns nur Wörter die mit M beginen
                .filter(s -> {return s.startsWith("M");})
                //sortieren sie der Länge nach
                .sorted(Comparator.comparingInt(String::length))
                //peek führt eine Aktion für jedes Element des Streams aus
                .peek(peekAusgabe)

                //Terminierung
                .forEach(s -> {/*tue nichts */});


        /*===noch ein anderes Beispiel===*/

        Stream<String> name3 = Stream.of("Merle", "Tim", "Mama", "Lotta");
        //hier einfach den übergebenen String auf der Konsole ausgeben
        Consumer<String> peekAusgabe2 = string -> {System.out.println(string);};

        //Streamverarbeitung
        name3.peek(peekAusgabe2)
                //Mit Lambda filten wir uns nur Wörter die mit M beginen
                //filtern kann ich mit was ich will, schaue nach was es gibt
                .filter(s -> {return s.startsWith("M");})
                //sortieren sie der Länge nach
                .sorted(Comparator.comparingInt(String::length))
                //
                .map(s -> s.length()) //String wird zum Integer; können den Typ mittendrin im Stream ändern

                //Terminierung
                .forEach((i) -> {System.out.println("Länge: " + i);});

        /*===Beispiel===*/
        Set<String> namenSet = new HashSet<>(Arrays.asList("Merle", "Tim", "Mama", "Lotta"));
        Stream<String> name4 = namenSet.stream();
        //hier einfach den übergebenen String auf der Konsole ausgeben
        Consumer<String> peekAusgabe3 = string -> {System.out.println(string);};

        //Streamverarbeitung
        //so ist das erste Element entfernt
        List<Integer> laengen = name4.sorted().skip(1)
                .peek(peekAusgabe3)
                //Mit Lambda filten wir uns nur Wörter die mit M beginen
                //filtern kann ich mit was ich will, schaue nach was es gibt
                .filter(s -> {return s.startsWith("M");})
                //sortieren sie der Länge nach
                .sorted(Comparator.comparingInt(String::length))
                //
                .map(s -> s + " ist toll!")
                .map(s -> s.length()) //String wird zum Integer; können den Typ mittendrin im Stream ändern

                //Terminierung
                //.forEach((i) -> {System.out.println("Länge: " + i);});
                .collect(Collectors.toList());


        /*===Beispiel===*/
        Stream<String> names = Stream.of("Frodo", "Sam", "Gandalf", "Aragorn");
        //er machst hier aus 5 Strings einen
        String alleNamen = names.reduce("", (text1, text2) -> text1 + " und " + text2);
        System.out.println(alleNamen);

        /*===reduce mit Zahlen===*/
        Stream<Integer> zahlen = Stream.of(1,2,3,4);
        int summe = zahlen.reduce(1, (s1, s2) -> s1*s2);

        System.out.println(summe);
    }
}
