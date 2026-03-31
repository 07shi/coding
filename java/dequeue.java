import java.util.*;
public class dequeue {// Java program to demonstrate the
    // addition of elements in deque
    
    
        public static void main(String[] args)
        {
            // Initializing an deque
            Deque<String> dq
                = new ArrayDeque<String>();
    
            // add() method to insert
            
            dq.addFirst("Geeks");
            dq.addLast("h");
            //dq.addLast("d");
            //dq.add("i");
    
            System.out.println(dq);
        }
    }
    

