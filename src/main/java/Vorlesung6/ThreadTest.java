package Vorlesung6;

public class ThreadTest {

    public static void main(String[] args){
        System.err.println("Hello World!");

        //so rufe ich den thread auf
        MeinThread mt = new MeinThread(/* kann auch hier Objekte erzeugen */);
        //zum starten des Threads brauche ich
        mt.start(); // -> ruft run() auf

        //allgemeine Funktionsweise
        /* Thread t = new Thread(() -> {
             //Anweisungen
           });
           t.start();
         */



        /*
        Geht auch mit Lambda:
        Thread t = new Thread(() -> {System.out.println("Hallo Thread!");});
        t.start();
         */

        System.err.println("Thread gestartet");
    }
}
