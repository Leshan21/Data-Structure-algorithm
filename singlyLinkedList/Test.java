class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

class singlyLinkedList{
    Node head;

    void addFirst(int e){
        Node temp = new Node(e);

        if(head == null){
            head = temp;
        }else {
            temp.next = head;
            head = temp;
        }
    }

    void print(){
        Node curr = head;

        System.out.print("[ ");

        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }

        System.out.println("null ]");
    }
}

 public class Test {

    public static void main(String[] args) {
        singlyLinkedList sl = new singlyLinkedList() ;
        sl.addFirst(35);
        sl.addFirst(34);
        sl.addFirst(56);
        sl.print();
    }
}