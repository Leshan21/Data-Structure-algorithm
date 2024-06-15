class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
 class circul {

    Node head;
    void addLast(int e){
        Node temp = new Node(e);
        
        if (head == null) {
            head = temp;
            temp.next = head;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head; 
        }
    }

    void print(){
        if (head == null) {
            System.out.println("list empty");
        } else {
            Node curr = head;
            while (curr.next != head) {
                System.out.print(curr.data+ "-->");
                curr = curr.next;
            }
            System.out.println(curr.data); 
        }
    }
}

public class index{
    public static void main(String[] args) {
        circul cl = new circul();

        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.print();
    }
}


