/**
 * Die Schnittstelle ADT_List beschreibt den Aufbau einer Liste 
 * entsprechend der Vorgaben zum Zentralabitur NRW vom Juli 2006.
 * 
 * Eine Entsprechung in Baden-Württemberg war im Februar 2010 noch nicht zu finden.
 * 
 * @author  Sebastian Funke
 * @version 1.0
 */

public interface ADT_List
{
    /*
     * Die Anfrage liefert den Wert true,
     * wenn die Liste keine elemente enthält,
     * sonst liefert sie den Wert false.
     */
    public boolean isEmpty();
  
    /*
     * Die Anfrage liefert den Wert true,
     * wenn der Positionszeiger vor dem ersten Listenelement oder vor der leeren Liste steht,
     * sonst liefert sie den Wert false.
     */
    public boolean isBefore();

    /*
     * Die Anfrage liefert den Wert true,
     * wenn der Positionszeiger hinter dem letzten Listenelement oder hinter der leeren Liste steht,
     * sonst liefert sie den Wert false.
     */
    public boolean isBehind();
  
    /*
     * Der Positionszeiger ist um eine Position in Richtung Listenende weitergerückt,
     * d.h. wenn er vor der Liste stand, wird das Element am Listenanfang zum aktuellen Element,
     * ansonsten das jeweils nachfolgende Listenelement.
     * Stand der Positionszeiger auf dem letzten Listenelement,
     * befindet er sich jetzt hinter der Liste.
     * Befand er sich hinter der Liste, hat er sich nicht verändert.
     */
    public void next();
    
    /*
     * Der Positionszeiger ist um eine Position in Richtung Listenanfang weitergerückt,
     * d.h. wenn er hinter der Liste stand, wird das Element am Listenende zum aktuellen Element,
     * ansonsten das jeweils vorhergehende Listenelement.
     * Stand der Positionszeiger auf dem ersten Listenelement, befindet er sich jetzt vor der Liste.
     * Befand er sich vor der Liste, hat er sich nicht verändert.
     */
    public void previous();
 
    /*
     * Der Positionszeiger steht auf dem ersten Listenelement.
     * Falls die Liste leer ist, befindet er sich jetzt hinter der Liste.
     */
    public void toFirst();

    /*
     * Der Positionszeiger steht auf dem letzten Listenelement.
     * Falls die Liste leer ist, befindet er sich jetzt vor der Liste.
     */
    public void toLast();
 
    /*
     * Die Anfrage liefert den Wert des aktuellen Listenelements bzw. null,
     * wenn die Liste keine Elemente enthält, bzw. der Positionszeiger vor oder hinter der Liste steht.
     */
    public Object getItem();

    /*
     * Vorher:  Die Liste ist nicht leer. Der Positionszeiger steht nicht vor oder hinter der Liste.
     * Nachher: Der Wert des Listenelements an der aktuellen Position ist durch pObject ersetzt.
     */
    public void update(Object pObject);
 
    /*
     * Vorher:  Der Positionszeiger steht nicht vor der Liste.
     * Nachher: Ein neues Listenelement mit dem entsprechenden Objekt ist angelegt und 
     * vor der aktuellen Position in die Liste eingefügt worden.
     * Der Positionszeiger steht hinter dem eingefügten Element.
     */
    public void insertBefore (Object pObject);

    /*
     * Vorher:  Der Positionszeiger steht nicht hinter der Liste.
     * Nachher: Ein neues Listenelement mit dem entsprechenden Objekt ist angelegt und
     * hinter der aktuellen Position in die Liste eingefügt worden.
     * Der Positionszeiger steht vor dem eingefügten Element.
     */
    public void insertBehind (Object pObject);

    /*
     * Vorher:  Der Positionszeiger steht nicht vor oder hinter der Liste.
     * Nachher: Das aktuelle Listenelement ist gelöscht.
     * Der Positionszeiger steht auf dem Element hinter dem gelöschten Element, bzw. hinter der Liste,
     * wenn das gelöschte Element das letzte Listenelement war.
     */
    public void delete();    
}
