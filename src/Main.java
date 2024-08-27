/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Menuk Fernando
 */
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.Insert(10);
        ll.Insert(20);
        ll.Insert(30);
        ll.Insert(40);
        ll.Insert(50);
        ll.Insert(60);
        ll.InsertAtStart(0);
        ll.InsertAt(4, 25);
        ll.deleteAt(1);
        
        ll.Show();
    }
}
