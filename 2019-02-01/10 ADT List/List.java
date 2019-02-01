/**
 * Die Klasse List implementiert die Schnittstelle ADT_List.
 * 
 * @author:     Sebastian Funke (nach einer Vorlage von David Tepasse)
 * @version:    1.0
 */

public class List implements ADT_List             
{
   Element head, actual, end;

   public List()                  
   {
     end = new Element(head, null, null);
     head = new Element(null, null, end);
     actual = head;
   }
   
   /* Sind außer den beiden Dummy-Elementen vor und nach der eigentlichen Liste
    * keine weiteren Elemente vorhanden, so ist die Liste leer.
    */
   public boolean isEmpty()
   {                                   
     return(head.getSuccessor() == end);
   }
   
   /* Wenn der aktuelle Zeiger auf dem vorderen Dummy-Element liegt, wird true zurückgegeben.*/
   public boolean isBefore() {
       return(actual==head);
   }
   
   /* Wenn der aktuelle Zeiger auf dem hinteren Dummy-Element liegt, wird true zurückgegeben.*/
   public boolean isBehind() {
       return (actual==end);
   }
  
   /* Der Nachfolger des aktuellen Elements wird selbst zum aktuellen Element.*/
   public void next() {
       actual = actual.getSuccessor();
   }
   
   /* Der Vorgänger des aktuellen Elements wird selbst zum aktuellen Element.*/
   public void previous() {
       actual = actual.getPredecessor();
   }
   
   /* Das vordere Dummy-Element wird zum aktuellen Element.*/ 
   public void toFirst() {
       actual = head;
   }
   
   /* Das hintere Dummy-Element wird zum aktuellen Element.*/
   public void toLast() {
       actual = end;
   }
   
   /* Das aktuelle Element wird angezeigt. */
   public Object getItem()
   {
     return (actual.getContent());
   }
   
   /* Der Inhalt des aktuellen Elements wird gesetzt.*/
   public void update(Object pObject) {
       actual.setContent(pObject);
   }
   
   /*
    * Ein neues Element wird erzeut und hinter dem aktuellen Element eingefügt.
    * Ist das hintere Dummy-Element das aktuelle Element, 
    * so wird er vor das Dummy-Element eingefügt.
    */
   public void insertBehind(Object newContent)
   {
       if (actual == end)
       {
           this.insertBefore(newContent);
        }
        else
        {
            Element newE = new Element (actual, newContent, actual.getSuccessor());
            actual.getSuccessor().setPredecessor(newE);
            actual.setSuccessor(newE);
        }
    }
   
   /*
    * Ein neues Element wird erzeut und vor dem aktuellen Element eingefügt.
    * Ist das vordere Dummy-Element das aktuelle Element, 
    * so wird er hinter das Dummy-Element eingefügt.
    */
   public void insertBefore(Object newContent)
   {
    if(actual==head)
    {
        this.insertBehind(newContent);
    }
    else
    {
        Element neu = new Element(actual.getPredecessor(), newContent, actual);
        actual.getPredecessor().setSuccessor(neu);
        actual.setPredecessor(neu);
    }
   }
   
   /*
    * Ist das aktuelle Element weder das vordere noch das hintere Dummy-Element,
    * so wird das aktuelle Element entfernt, 
    * in dem das vorhergehende Element auf das nachfolgende Element verweist und umgekehrt.
    * "Tod durch Nicht-Beachtung."
    */
   public void delete()
   {                                   
       if(isBefore()){
           System.out.println("Head can not be deleted.");
        }
       else if (isBehind()){
          System.out.println("End can not be deleted.");
        }
       else if (!isBehind() && !isBefore()){
           actual.getSuccessor().setPredecessor(actual.getPredecessor());
           actual.getPredecessor().setSuccessor(actual.getSuccessor());
           next();
        }
   }
}