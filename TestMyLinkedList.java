
/*
Christina Nguyen
CSC 331 - 001
Lab 8 : Intro to Java Generics
 */

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList prog = new MyLinkedList();

        System.out.println(">> Creating 5 account objects...");
        Account a = new Account(100);
        Account b = new Account(200);
        Account c = new Account(300);
        Account d = new Account(400);
        Account e = new Account(500);

        System.out.println(">> Testing add(A eObj)...");
        System.out.println("Adding objects 'a-e' to linked list");
        prog.add(a);
        prog.add(b);
        prog.add(c);
        prog.add(d);
        prog.add(e);
        System.out.println();

        System.out.println(">> Testing size()...");
        System.out.println("The linked list had " + prog.size() + " elements." + "\n");

        System.out.println(">> Testing isIn(A eObj)...");
        System.out.println("Is eObj 'a' in the linked list? " + prog.isIn(a) + "\n");

        System.out.println(">> Testing get()...");
        System.out.println("get(0) : " + prog.get(0));
        System.out.println("get(3) : " + prog.get(3));
        System.out.println("get(60) : " + prog.get(60) + "\n");


        System.out.println(">> Testing pop()...");
        System.out.print("Head (before popping): ");
        prog.gethead();
        System.out.println("pop():  " + prog.pop());
        System.out.print("Head (after popping): ");
        prog.gethead();
        System.out.println(">> Testing pop(int index)...");
        System.out.println("pop(1) " + prog.pop(2) + "\n");

        System.out.println(">> Testing append(A eObj)");
        System.out.println("Appending object 'z'...");
        Account z = new Account(900);
        prog.append(z);
        System.out.println(prog.get(prog.size() - 1));







    }   // end of main
}   // end of class
