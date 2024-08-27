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
    
    public void InsertAt(int index, int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        if (index == 0) {
            InsertAtStart(data);
        }else {
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }       
    }
    
    public void deleteAt(int index){
        Node n1 = null;
        if(index == 0){
            head = head.next;
        }else{
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            n1 = currentNode.next;
            currentNode.next = n1.next;
            n1 = null;
        }
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
