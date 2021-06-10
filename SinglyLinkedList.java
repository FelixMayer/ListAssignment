package ListAssignment;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node runner = head;
        if(isEmpty() == true) {
            return;
        } else if ( runner.next == null) {
            runner = null;
        } else {
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
        
    }

    public void printValues() {
        Node runner = head;
        System.out.println('\n');
        while (runner != null) {
            System.out.print(" | " + runner.value + " | ");
            runner = runner.next;
        }
    }
}