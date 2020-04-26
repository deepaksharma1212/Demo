import java.util.*;

public class LinkedList {

	private Node start;
	
	static class Node{
		
		private Object data;
		private Node next;
		
		Node(Object data,Node node){
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
	}
	
	public boolean addNode(Node node) {
		
		if(this.start == null) this.start = node;
		else {
			Node temp = this.start;
			node.next = temp;
			this.start = node;
		}
		return true;
	}

	/**
	 * @return the start
	 */
	public Node getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Node start) {
		this.start = start;
	}
	public Object findMiddle(Node start) {
		
		if(start == null) return 0;
		if(start.next == null) return start.data;
		
		Node current = start;
		Node middle = start;
		int length =0;
		while(current != null && current.next != null) {
			length++;
			if(length%2==0)
				middle = current;
			else
				middle = middle.next;
			current = current.next.next;
		}	
		return middle.data;
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		Node start3 = new LinkedList.Node(6,null);
		Node start2 = new LinkedList.Node(6,null);
		Node start = new LinkedList.Node(5,null);
		Node node1 = new LinkedList.Node(4,null);
		Node node2 = new LinkedList.Node(3,null);
		Node node3 = new LinkedList.Node(2,null);
		Node node4 = new LinkedList.Node(1,null);
		list.addNode(start3);
		list.addNode(start2);
		list.addNode(start);
		list.addNode(node1);
		list.addNode(node2);
		list.addNode(node3);
		list.addNode(node4);
		
		System.out.println(list);
		System.out.println(list.findMiddle(list.start));
		
	}

	@Override
	public String toString() {
		return "LinkedList [start=" + start + "]";
	}
	
}


