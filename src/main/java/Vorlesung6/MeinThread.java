package Vorlesung6;

import java.util.ArrayList;
import java.util.List;

public class MeinThread extends Thread{

    private List<Runnable> aufgaben = new ArrayList<>();


    public void addAufgaben(Runnable r){
        //mit Synchronized stelle sicher, dass die Blöcke nie gleichzeitig laufen
        synchronized (aufgaben) {
            while(!aufgaben.isEmpty()) {
                var r = aufgaben.remove(0);
                r.run();
            }
        }

    }


    @Override
    public void run(){
        synchronized (aufgaben) {
            System.err.println("Thread: Hallo!");

        }


    }
}
