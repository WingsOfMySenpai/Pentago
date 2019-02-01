import java.io.*;
/**
 * The class CD_Collection is an example for using the ADT List.
 * It is a subclass of the class list.
 * 
 * @author:  S.Funke
 * @version: 04.02.2010
 */

public class CD_Collection extends List
{
    public CD_Collection()
    {   
        this.insertBehind(55);
        this.insertBehind(24);
        this.insertBehind(6);
        this.insertBehind(7);
        this.insertBehind(9);
        this.insertBehind(1);
        this.insertBehind(2);
        this.insertBehind(5);
        this.insertBehind(4);
    }
    
    public void gibGanzeListeAus() {
        String ausgabezeile="Liste: ";
        this.toFirst();
        this.next();
        while (!this.isBehind()) {
            ausgabezeile = ausgabezeile + this.getItem() + " ";
            this.next();
        }
        System.out.println(ausgabezeile);
    }
    
    /* Vorausgesetzt, dass die vorhandene Liste bereits aufsteigend sortiert ist,
     * kann man mit Hilfe der folgenden Methode schnell ein weiteres Element in die Liste einsortieren.
     */
    
    public void insertion_sort(int new_song)
    {
        /* Der Positionszeiger der Liste wird vor den Beginn der Liste gesetzt */
        this.toFirst();
        
        /* Der Positionszeiger der Liste wird auf das erste Element der Liste verschoben. */
        this.next();
        
        /* Kontrollausgabe der ganzen Liste*/
        gibGanzeListeAus();
        
        while (!this.isBehind()) {
            /* Sobald das nächstgrößere Element in der Liste gefunden wurde, 
             * wird der neue Song davor einsortiert.*/
            if ((Integer.parseInt((String)this.getItem())) > new_song) {
                   this.insertBefore(new_song);      
            }
            /* Der Positionszeiger wandert eine Stelle weiter durch die Liste. */
            this.next();
        }
    }
}
