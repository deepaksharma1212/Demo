// { Driver Code Starts
//Initial Template for Java

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class Segregate
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList1().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



class LinkedList1
{
    static Node segregate(Node node)
    {
    	BigInteger b = new BigInteger("1");
    	b.add(new BigInteger("1"));
        ArrayList<Node> l1 = new ArrayList<Node>();
        ArrayList<Node> l2 = new ArrayList<Node>();
        ArrayList<Node> l3 = new ArrayList<Node>();
        HashMap<String,ArrayList<Node>> map = new HashMap<String,ArrayList<Node>>();
        map.put("0",l1);
        map.put("1",l2);
        map.put("2",l3);
        Node nd = node;
        while(node != null ){
            
            if(node.data == 0){
                map.get("0").add(node);
            }
            if(node.data == 1){
                map.get("1").add(node);
            }
            if(node.data == 2){
                map.get("2").add(node);
            }
            node = node.next;
        }
        node = nd;
        if(map.containsKey("0")){
        	System.out.println(map.get("0").size());
            for(Node n : map.get("0")){
                 if(node != null ){
                    node.data = 0;
                    node = node.next;
                }       
            }
        }
        if(map.containsKey("1")){
        	System.out.println(map.get("1").size());
            for(Node n : map.get("1")){
                 if(node != null ){
                    node.data = 1;
                    node = node.next;
                }       
            }
        }
        if(map.containsKey("2")){
        	System.out.println(map.get("2").size());
            for(Node n : map.get("2")){
                 if(node != null ){
                    node.data = 2;
                    node = node.next;
                }       
            }
        }
        
        return nd;
    }
}


