class Node {   // user defined data type
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        
    }
}

class Linkedlist {   // user defined data structure
    Node head;   // initially null
    Node tail;   // initially null
    int size;

    // Search an element
    boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Add at tail
    void addattail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // Add at head
    void addathead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // Delete at head
    void deleteathead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;

        if (size == 0) { // list becomes empty
            tail = null;
        }
    }

    // Insert at index
    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (idx == 0) {
            addathead(val);
        } else if (idx == size) {
            addattail(val);
        } else {
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class lldatastrucutre {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.addattail(10);
        ll.display();

        ll.addattail(20);
        ll.display();

        ll.addattail(30);
        ll.addattail(40);

        ll.addathead(50);
        ll.display();

        ll.insert(40, 2);
        ll.display();

        System.out.println("Size: " + ll.size);
        System.out.println("Search 20: " + ll.search(20));
        System.out.println("Search 100: " + ll.search(100));
    }
}

