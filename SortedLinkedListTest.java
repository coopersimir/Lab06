/**
 * This program test the functions of the SortedLinkedList program.
 * @author Simir Cooper
 * @since 3/18/21
 */
import Sorted_Functions.*;
public class SortedLinkedListTest{

	public static void main(String[] args) {
		SortedLinkedList<String> a1 = new SortedLinkedList<String>();
		//Test size function beforehand 
		System.out.println(a1.size());
		//Test add
		a1.add("C");
		a1.add("B");
		a1.add("E");
		a1.add("A");
		a1.displayList();
		//Test remove
		a1.remove(3);
		a1.displayList();
		//Test get function
		System.out.println(a1.get(1));
		//Test size function
		System.out.println(a1.size());

	}

}
