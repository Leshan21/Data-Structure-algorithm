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
}