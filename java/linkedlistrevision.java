import java.util.*;

public class linkedlistrevision {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
            Node head;
            void inserAtEnd(int data){
                Node newNode = new Node(data);
                if(head==null){
                    head = newNode;
                    return;
                }
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;

                }
                temp.next = newNode;
            }
            void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data+"-->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        
    public static void main(String args[]){
        linkedlistrevision list = new linkedlistrevision();
        list.inserAtEnd(10);
        list.inserAtEnd(20);
        list.display();
    }
}
