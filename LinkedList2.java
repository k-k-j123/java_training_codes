class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;

    LL() {
        head = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtPostition(int pos, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            Node temp = head;
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

}

public class LinkedList2 {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.display();
        ll.addFirst(50);
        ll.addFirst(60);
        ll.display();
        ll.addAtPostition(2,70);
        ll.addAtPostition(3, 90);
        ll.display();
    }
}
