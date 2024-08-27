/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Menuk Fernando
 */
public class LinkedList {
    Node head;
    
    public void Insert(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    
    public void InsertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void Show(){
        Node node = head;
        while(node.next!=null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(node.data);
    }
}
