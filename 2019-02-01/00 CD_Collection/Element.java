/**
 * Die Klasse Element beschreibt den Aufbau eines Listenelements der Klasse List.
 * 
 * @author:  Sebastian Funke (nach einer Vorlage von David Tepaﬂe)
 * @version: 1.0
 */
public class Element
{
    private Element predecessor;    // Vorg‰nger
    private Object content;         // Inhalt
    private Element successor;      // Nachfolger
    
    /*
     * Beim Erzeugen eines neuen Elements der Liste werden die Vorg‰nger und
     * Nachfolger und der Inhalt des Elements festgelegt.
     */
    public Element (Element p, Object c, Element s) {
      predecessor   = p;      
      content       = c;
      successor     = s;
    }
    
    public void setSuccessor(Element s) {
        successor = s;
    }
    
    public Element getSuccessor() {
        return successor;
    }
    
    public void setPredecessor(Element p) {
        predecessor = p;
    }
    
    public Element getPredecessor() {
        return predecessor;
    }
    
    public void setContent(Object c) {
        content = c;
    }
    
    public Object getContent() {
        return content;
    }
}
