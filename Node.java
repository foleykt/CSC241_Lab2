
/**
 *
 * @author Kyle
 */
public class Node {
    
    public int uid;
    public int size;
    public Node next;
    
    
    //Constructs a node which contains a UID, a size, and a null reference to 
    //determine the end of the List it's put into
    Node(int uid, int size) {
        this.uid = uid;
        this.size = size;
        this.next = null;
    }// end node constructor 
    
}// end class Node