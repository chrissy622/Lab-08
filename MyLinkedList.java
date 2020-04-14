
/*
Christina Nguyen
CSC 331 - 001
Lab 8 : Intro to Java Generics
 */

import java.util.Comparator;

public class MyLinkedList<A extends Comparator<A>> implements ILinkedList<A> {

    class Node {
        Node next;
        A data;
        public Node(A data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    /*
    Returns the content of the head of the linked list
     */
    public void gethead() {
        System.out.println(this.head.data);
    }

    /*
    Adds eObj to the front of the list
     */
    @Override
    public void add(A eObj) {
        Node temp = new Node(eObj);
        if(this.head == null) {
            this.head = temp;
        } else {
            temp.next = head;
            this.head = temp;
        }
    }

    /*
    Adds a parameterized type eObj to the end of the list
     */
    @Override
    public void append(A eObj) {
        if(this.head == null) {     //list is empty
            this.head = new Node(eObj);
        } else {    // traverse list to last node

            Node current = this.head;
            Node previous = null;
            while (current != null) {
                previous = current;
                current = current.next;
            }
            if(previous != null) {
                previous.next = new Node(eObj);
            }
        }
    }

    /*
    Returns the parameterized type in the node at the index but does not delete the node from the list.
        * parameterized type: types that take other types as a parameter ex: Collections<String>
     */
    @Override
    public A get(int index) {
        Node current = this.head;
        if (this.head == null) {
            System.out.println("The linked list is empty");
            return null;
        } else if (index < 0 | index > this.size() - 1) {
            System.out.println("The given index is out of range of the linked list");
            return null;
        } else {
            int count = 1;
            while (count <= index){
                current = current.next;
                count++;
            }
        }
        return current.data;
    }

    /*
    Deletes and returns the parameterized type in the node at position index of the list.
     */
    @Override
    public A pop(int index) {
        Node current = this.head;
        Node previous = null;
        Node pop = null;
        if (this.head == null) {
            System.out.println("The linked list is empty");
            return null;
        } else if (index < 0 | index > this.size() - 1) {
            System.out.println("The given index is out of range of the linked list");
            return null;
        } else {
            int count = 1;
            while (count <= index) {
                previous = current;
                current = current.next;
                count++;
            }
            pop = current;
            previous.next = current.next;
        }
        return current.data;
    }

    /*
    Deletes and returns the parameterized type in the node at the front of the list.
     */
    public A pop() {
        Node popped = this.head;
        this.head = this.head.next;
        return popped.data;
    }

    @Override
    public boolean isIn(A eObj) {
        boolean found = false;
        Node temp = this.head;
            while (temp != null) {
                if (temp.data.compare(eObj, temp.data) == 0) {
                    found = true;
                    break;
                }
                temp = temp.next;
            }
        return found;
    }

    @Override
    public int size() {
        int count = 0;
        Node temp = this.head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}// end of class
