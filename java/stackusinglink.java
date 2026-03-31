import org.w3c.dom.Node;

public class stackusinglink {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node top = null; // Initialize the stack as empty

        // Push elements onto the stack
        top = push(top, 10);
        top = push(top, 20);
        top = push(top, 30);

        // Display the stack
        display(top);

        

        // Check if the stack is empty
        if (isEmpty(top)) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }

        // Check if the stack is full (linked list-based stack never overflows under normal conditions)
        System.out.println("Is stack full? " + isFull());
    }

    // Function to push an element onto the stack
    static Node push(Node top, int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        System.out.println(value + " pushed onto the stack");
        return newNode;
    }

    // Function to pop an element from the stack
    static Node pop(Node top) {
        if (isEmpty(top)) {
            System.out.println("Stack underflow");
            return null;
        }
        System.out.println("Popped element: " + top.data);
        return top.next;
    }

    // Function to peek the top element
    static int peek(Node top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty, no element to peek.");
            return -1;
        }
        return top.data;
    }

    // Function to check if the stack is empty
    static boolean isEmpty(Node top) {
        return top == null;
    }

    // Function to check if the stack is full
    static boolean isFull() {
        // Since it's a linked list-based stack, it usually won't overflow unless memory runs out.
        return false; // Simulated result
    }

    // Function to display the stack
    static void display(Node top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

    
    

