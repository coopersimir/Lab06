/**
 * SortedLinkedList is a modified version of Linked List program that 
 * maintains the order of the nodes within the list. The program has four
 * functions: add, remove, get, and size.
 * @author Simir Cooper 
 * 
 */
package Sorted_Functions;

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {
	protected Node head;
    protected int size;
    /**
     * Constructor 
     */
    public SortedLinkedList () {
    	head = null;
    	size = 0;
    }
    /**
     * Adds node to Linked List and maintains its order.
     * @return true when node is successfully added
     */
	public boolean add(T item) {
		Node newNode = new Node(item); //creates a new node
		Node curr = head; //current node is the head of the linked list
		Node prev = null; //previous node is used to compare items when the list has a size >0
		while(curr != null && item.compareTo(curr.data)>0) {
			prev = curr;
			curr = curr.next;
		}
		//add item to 1st position of the list (there are nodes present thus previous ==null)
		if(prev == null){
			head = newNode;
		}else {
			prev.next = newNode;
		}
		newNode.next = curr;
		++size;
		return true;
		
	}
	/**
	 * Removes node from Linked List.
	 * @return the specified node's data
	 */
	public T remove(int pos) {
		if(pos <0 || pos>=size) {
    		throw new UnsupportedOperationException("Invalid Position");
    	}
		//remove item from 1st position (special case)
		if (pos == 0) {
			Node node = head;
			head = head.next;
			--size;
			return node.data;
		}else {
			Node prev = head;
			for (int i=0; i < pos-1; i++) {
				prev = prev.next;
			}
			Node node = prev.next;
			prev.next = node.next;
			--size;
			return node.data;
		}
	}
	/**
	 * Gets the data of the node from the specified position.
	 * @return data of the node
	 */
	public T get(int pos) {
		if(pos <0 || pos>=size) {
    		throw new UnsupportedOperationException("Invalid Position");
    	}
		Node curr = head;
		for (int i = 0; i < pos; i++) {
			curr = curr.next;
		}
		return curr.data;
	}
	/**
	 * Gets the size of the array 
	 * @return size
	 */
	public int size() {
		return size;
	}
	/**
	 * Private node class
	 */
	private class Node{
		T data;
		Node next;
		public Node(T value) {
			data = value;
			next = null;
		}
		/**
		 * Prints the data of the node
		 */
		public void displayItem(){
		      System.out.print(data + " ");
		    }
		
	}
	 /**
	  * Displays the values of the linked list
	  */
	 public void displayList(){
		 Node curr = head;
		 while(curr != null){
		      curr.displayItem();
		      curr = curr.next;
		    }
		    System.out.println("");
		  }

}
