public class insertatend1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtend(int val){
            Node temp = new Node(val);// new node with value
            if(head==null){
                head = temp;
                
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String args[]){
        

    }
}
