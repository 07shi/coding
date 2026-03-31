class Node{// user defined data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{// user defined data structure
    Node head;// null
    Node tail;// null
    int size;
    boolean search(int val){
        if(head==null) return false;
        Node temp = head;
        while(temp!=null){
            if(temp.val == val) return true;
        
            temp = temp.next;
        }
        return false;
    }
    void addattail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;

    }
    void addathead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;

    }
    void deleteathead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }
    
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;

        }
        System.out.println();
    }
    void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        else if(idx==0) addathead(val);
        else if(idx==size) addattail(val);
        else{
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
            
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid choice");
        }
        if(idx==0){
            deleteathead();
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;// delete
        if(idx == size-1) tail = temp; // we are deleting tail
        size--;
    }
}
public class linkedlistdatastructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addattail(10);ll.display();
        ll.addattail(20);ll.display();
        ll.addattail(30);
        ll.addattail(40);
        ll.addathead(50);
        ll.display();
        
        
        ll.insert(40,2);
        ll.display();
        ll.delete(3);
        ll.display();
    }
    
}
