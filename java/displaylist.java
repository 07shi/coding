class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        

    }
}
public class displaylist {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;// very important
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10);// head node
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);

    }
}
