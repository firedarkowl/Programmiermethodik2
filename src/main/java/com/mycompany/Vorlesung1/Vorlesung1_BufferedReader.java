
package com.mycompany.Vorlesung1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usach
 */
public class Vorlesung1_BufferedReader {
    
    public static void main(String[] args) {
        
        //hier wieder mit try - catch arbeiten
        try {
            
            //Reader ===================================================================================================================
            
            //mit dem BufferedStreamReader buffern wir alle Streams und ist besser von der Hardware/Performance
            Reader in = new InputStreamReader(new BufferedInputStream(new FileInputStream("test.txt")));
            
            //erstelle einen Puffer, wohin die Zeichen abgespeichert werden
            char[] buf = new char[4]; //
            
            //wir rufen nun unseren Reader auf und der speichert die eingelesenen Zeichen in den erstellten Puffer
            in.read(buf);
            
            //aus dem Puffer erstellen wir ein String Objet, welches wir dann auf der Konsole ausgeben können
            String str = new String(buf);
            System.out.println(str);
            in.close();
            
            //Writer ====================================================================================================================
            
            //analog mit dem BufferedStreamWriter
            //aufpassen bei Umlautzeichen und so
            Writer out = new FileWriter("test2.txt");
            out.write("Hallo Leute wie gehts?");
            out.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vorlesung1_Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vorlesung1_Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
