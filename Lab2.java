/*
 * Author: Kyle Foley
 *
 * Class: CSC 241.001
 *
 * Professor: Dr. Strader
 *
 * Project: Lab2
 *****************************************************************************
 * Lab2 is designed to read in a file and make a prioritized printer management
 * system. This system accepts four types of requests: Allocation, deAllocation,
 * Status, and Quit.
 *
 *
 *
 *****************************************************************************/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       LinkedList L1 = new LinkedList();
       LinkedList L2 = new LinkedList();
       
       int uid;
       int priority;
       int size;
       
       //Scanner to read in the file
       Scanner in = new Scanner(new File("lab2.dat"));
       
       //Reading through file to gather data needed
       while (in.hasNextLine()){
           String line = in.nextLine();
           //splitting string line into the parts to be handled by the program
           String[] split = line.split(" ");
           //command will give us the operation to perform
           char command = split[0].charAt(0);
           
           //Switch statement to handle the four different operation
           //possibilities given in the file.
           if ((command == 'p') || (command =='d') || 
                   (command == 's') || (command == 'q')){
           switch(command){
               
                // Inserting a new node into the reference variable "head"
               case 'p':
                   // Variables to hold data from the file to input to the list
                   uid = Integer.parseInt(split[1]);
                   priority = Integer.parseInt(split[2]);
                   size = Integer.parseInt(split[3]);
                   
                   //Determines which list to store the node in
                   if (priority == 1)
                       L1.allocate(uid, size);
                   else
                       L2.allocate(uid, size);
                   
                   //Display what was added to which list
                   System.out.println("Print Job for user " + uid + 
                           " added at priority " + priority + "!");
                   break;
                   
               case 'd':
                   //delete node referenced by head
                   priority = Integer.parseInt(split[1]);
                   if (priority == 1)
                       L1.deAllocate();
                   else
                       L2.deAllocate();
                   break;
               case 's':
                   //call method to print list for priority wanted
                   priority = Integer.parseInt(split[1]);
                   if (priority == 1)
                       L1.status(priority);
                    
                   break;
               case 'q':
                   //clear all nodes and terminate
                   L1.quit();
                   L2.quit();
                   
                   break;
           }// end big if
           
           } // end switch
           else{
           System.out.println("Invalid input");
           
           }// end else
       }// end while
           
       
    } // end main
    
} // end class Lab2