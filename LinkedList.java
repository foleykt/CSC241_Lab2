
/**
 *
 * @author Kyle
 */
import java.util.*;
import java.io.IOException;

public class LinkedList {
    
    private Node head;
    static private Node curr;
    private int count;
    
    public LinkedList(){
        this.head = null;
        this.count = 0;
    }// end linkedList constructor
    
    public void allocate(int uid, int size){
        //Creates a new node at the end of the list
        Node newNode = new Node(uid, size);
        
        if(head == null){
            head = newNode;
            head.next = null;
            curr = head;
            count++;
            //debugging
            //System.out.println("Head is: " + head.size);
        }//end if
        
        else{
            while (curr.next != null){
                curr = curr.next;
            }// end while
            
            curr.next = newNode;
            curr = curr.next;
            count++;
        }// end else
        
    }// end allocate
    
    public void deAllocate() throws NullPointerException{
        // Removes node at "head"
        if (head == null){
            System.out.println("There is no list.");
        }
        else if (head.next == null){
            head = null;
            System.out.println("");
        }// end if
        
        else{
            head = head.next;
        }// end else
        
    }// end deAllocate
    
    public void status(int priority){
        // print list
        if (head == null){
            System.out.println("There is no list " + priority);
        }// end if
        else if (head.next == null){
            System.out.println(" Jobs on priority list " + priority + " are: " 
                    + head.size);
        }// end if
        
        else {
            System.out.print("Jobs on priority list " + priority + " are: ");
            for (curr = head; curr.next != null; curr = curr.next){
                System.out.print(curr.size + ", ");
            }
            System.out.println();
        }//end else 
             
    }// end status
    
    public void quit(){
        // clears the list and terminates program
        if (head != null){
            if (head.next == null){
            head = null;
            
        }// end if
        
            else{
                while(head.next != null){
                head = head.next;
            }// end while
                
            head = null;
        }// end else
        }// end big if
    }// end quit
    
}// end class LinkedList