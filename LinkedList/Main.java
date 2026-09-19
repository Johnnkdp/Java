public class Main {

    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        // Add at Head
        list.addAtHead(20);
        list.addAtHead(10);

        // Add at Tail
        list.addAtTail(30);
        list.addAtTail(40);

        // Display
        list.display();

        // Add at Position
        list.addAtPosition(25, 3);

        list.display();

        // Delete at Head
        list.deleteAtHead();

        list.display();

        // Delete at Tail
        list.deleteAtTail();

        list.display();

        // Delete at Position
        list.deleteAtPosition(2);

        list.display();
    }
}