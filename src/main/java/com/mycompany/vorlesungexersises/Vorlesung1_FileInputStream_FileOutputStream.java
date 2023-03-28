package com.mycompany.vorlesungexersises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usach
 */
public class Vorlesung1_FileInputStream_FileOutputStream {

    public static void main(String[] args) {
        try {
            
            //FileInputStream=========================================================================================================================
            
            //hier haben wir unserem Stream nur geöffnet, der liest noch nix
            //wirft eine Exception, deshalb an der Stelle einen try catch block einfügen
            //name der Datei: wenn ich keinen Ordner angebe oder keinen Verzeichniss, dann wird im Arbeitsverzeichnis gesucht
            //in NetBeans ist es os eingestellt, dass der Hauptverzeichnis der Arbeitsverzeichnis ist
            //wenn wir irgendeinen shit von sonst wo öffnen wollen, dann muss man den kompletten Pfad angeben, also zb: C:/dd/luu/test.txt
            FileInputStream in = new FileInputStream("test.txt");
            
            
            //hier können wir den Scheiß lesen
            //nenne b, nimmt er immer für byte
            //var ist ein keyword: ist quasi ein "jocker", er parst es in char/int/double/string und boolean, je nach dem was ausgelesen wird
            //fun fact: read() hat als Rückgabetyp int, damit ich die -1 korrekt abbilden kann (Verschiebung des Datensatzes auf 0...256)
            var b = in.read();
            //hier um das erste Zeichen auszugeben
            System.out.print(" " + b);
            
            //da read nur ein Zeichen liest, brauchen wir eine Schleife
            //somit werden alle Zeichen eingelesen
            //read() liefert -1 wenn er am Ende angekommen ist, deshalb brauchen wir hier 'b != -1'
            while(b != -1){
                b = in.read();
                System.out.print(" " + b); //er gibt mit Zahlen aus, weils ASCII sind!!!
            }
            //kommt dann am Ende: 72 97 108 108 111 32 72 65 87 33 10 -1 raus
            //10 steht für Zeilenumbruch & -1 dafür dass die Datei fertig gelesen wurde
            
            //wenn man was gelesen hat dann soll man den Stream auch schließen, geschieht mit close()
            //close kann eine IOException werfen, daher muss man die ebenfals catchen
            in.close();
            
            //FileOutputStream=========================================================================================================================
            
            //Stream zum Einschreiben geöffnet, gibt zwei varianten
            //die untere eröffnet eine neue Datei im Arbeitsverzeichnis und schreibt da rein
            //bei der anderen Variante übergibt man den Dateinamen, der schon existiert und true, damit er von der neuen Zeile (?) da schreiben kann
            FileOutputStream out = new FileOutputStream("test2.txt");
            
            //write() Methode aufrufen, die schreibt byte weise da rein
            out.write(72);
            out.write(73);
            out.write(72);
            out.write(73);
            
            //do not forget den Strom zu schließen
            //die Datei wird erst dann beschrieben, wenn ich den close() hab
            //anderfalls landet alles in den Puffer der Systems und gehen beim Schließen des Programms verloren
            out.close();
            
            
            //===========================================================================================================================================
            //diverse Catches, muss man überlegen welche sinnvoll zu lassen sind
            //ich lasse alle, damit ich immer noch alles nachvollziehen kann
            //aber bräuchte in dem Fall nur die IOException, weil sie die obere mitabdeckt
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vorlesung1_FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vorlesung1_FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
