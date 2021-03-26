/**
 * Program tests sorted linked list functions
 * @author Simir Cooper
 * @since 3/18/21
 * 
 */
import Sorted_Functions.*;
public class SortedLinkedListTest{
	void test() {
		SortedLinkedList<String> a1 = new SortedLinkedList<String>();
		//Test empty at start
		if(a1.size()!=0) {
			System.out.println("Not empty at construction");
			return;
		}
		System.out.println("Passed Test: 1");
		//Test add
		String [] arr = {"B", "E", "C"};
		int count = 0;
		for(int i= 0; i<arr.length;i++) {
			a1.add(arr[i]);
			++count;
		}
		if(a1.size()!=count) {
			System.out.println("Array does not add correctly");
			return;
		}
		System.out.println("Passed Test: 2");
		//Test keeps in position
		for(int w=0; w<a1.size()-1;w++) {
			if(a1.get(w).compareTo(a1.get(w+1))>0) {
				System.out.println("Array is not sorted");
				return;
			}	
		}
		System.out.println("Passed Test: 3");
		//Test Position 
		try {
			int pos =3;
			a1.get(pos);
			System.out.println("Got invalid position");
			return;
			
		}catch (Exception e){
			//do nothing
		}
		try {
			int pos =3;
			a1.remove(pos);
			System.out.println("Removed invalid position");
			return;
			
		}catch (Exception e){
			//do nothing 
		}
		System.out.println("Passed Test: 4");
		//Test Remove
		String removal_value = "E";
		if(!a1.remove(2).equals(removal_value)) {
			System.out.println("Remove does not work correctly");
			return;
		}
		System.out.println("Passed Test: 5");
	}
	public static void main(String[] args) {
		SortedLinkedListTest lt = new SortedLinkedListTest();
		lt.test();
		
	}

}
