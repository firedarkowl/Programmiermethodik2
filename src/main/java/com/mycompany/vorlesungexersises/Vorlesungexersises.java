package com.mycompany.vorlesungexersises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usach
 */
public class Vorlesungexersises {

    public static void main(String[] args) {
        try {
            //hier haben wir unserem Stream nur geöffnet, der liest noch nix
            //wirft eine Exception, deshalb an der Stelle einen try catch block einfügen
            //name der Datei: wenn ich keinen Ordner angebe oder keinen Verzeichniss, dann wird im Arbeitsverzeichnis gesucht
            //in NetBeans ist es os eingestellt, dass der Hauptverzeichnis der Arbeitsverzeichnis ist
            FileInputStream in = new FileInputStream("test.txt");
            
            //hier können wir den Scheiß lesen
            //nenne b, nimmt er immer für byte
            //var ist ein keyword: ist quasi ein "jocker", er parst es in char/int/double/string und boolean, je nach dem was ausgelesen wird
            var b = in.read();
            //wenn man was gelesen hat dann soll man den Stream auch schließen, geschieht mit close()
            //close kann eine IOException werfen, daher muss man die ebenfals catchen
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vorlesungexersises.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vorlesungexersises.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
