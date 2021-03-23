/**
 * @author Simir Cooper
 * @since 3/18/21
 * 
 */
import Sorted_Functions.*;
public class SortedArrayTest{
	public static void main(String[] args) {
		SortedArrayList<String> a1 = new SortedArrayList<String>();
		//Test size beforehand 
		System.out.println(a1.size());
		//Test add 
		a1.add("C");
		a1.add("B");
		a1.add("E");
		a1.add("A");
		//Print array
		System.out.println(a1);
		//Test size after add
		System.out.println(a1.size());
		//Test remove
		System.out.println(a1.remove(0));
		//Print array after remove
		System.out.println(a1);
		//Test get 
	    System.out.println(a1.get(0));

	}

}
