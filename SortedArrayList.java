/**
 * SortedArrayList is a modified version of the Array List program that 
 * maintains the order of a user's generated Array List.
 * The program has four functions: add, get, remove and size.
 * @author Simir Copper
 * @since 3/18/21
 * 
 */
package Sorted_Functions;
public class SortedArrayList<T extends Comparable<T>> implements SortedList<T>{
	protected T[] arr;
    protected int size;
  /**
   * Constructor 
   */
    public SortedArrayList() {
    	arr = (T[]) new Comparable[10]; //creates a generic object array of size 10
        size = 0; 
    }
    void swap (T[] arr, int i, int j) {
    	T temp = arr[i]; //sets temporary to the greater value in the array
		arr[i] = arr[j]; //places the smaller item in the correct position 
		arr[j] = temp; //moves the greater value over into the correct position
	}
    /**
     * adds item to array list and sorts it
     * @param T item
     * @return true when item is added
     */
	public boolean add(T item) {
		if (size == arr.length) {
    		grow_array();
    	}
		arr[size++] =item; //adds item to the array before sorting from the most current position
		for(int i= size-1; i>0 && item.compareTo(arr[i-1])<0; i--) {
				swap(arr, i, i-1);
				}
		
    	return true;
	}
	/**
	 * returns the item in the list at the specified position 
	 * @param int pos
	 * @return an item
	 */
	public T get(int pos) {
		if(pos <0 || pos>=size) {
    		throw new UnsupportedOperationException("Invalid Position");
    	}
    	return arr[pos];
        
	}
	/**
	 * removes the item in the list at the specified position
	 * @param int pos
	 * @return an item
	 */
	public T remove(int pos) {
		if(pos <0 || pos>=size) {
    		throw new UnsupportedOperationException("Invalid Position");
    	}
    	T item = arr[pos];
    	for(int i=pos; i<size; i++) {
    		arr[i] = arr[i+1];
    	}
    	--size;
    	return item;
	}
	/**
	 * returns the size of the Array List 
	 * @return size
	 */
	public int size() {
		return size;
	}
	/**
     * Dynamically grow the array with the size of the ArrayList
     */
    private void grow_array() //doubles size of array
    {
    	T [] new_arr = (T[]) new Comparable[arr.length * 2];
    	for (int i = 0; i < arr.length; i++) {
    		new_arr[i] = arr[i];
    	}
    	arr = new_arr;
    }
    /**
     * prints array
     * @return result
     */
    public String toString(){
        String result = "";
        for(int i=0; i< size; i++)
        {
        	if( i ==size-1) {
        		result = result+ get(i);
        	}
        	else {
        		result = result + get(i)+", ";
        	}
            
        }
        return "["+ result+"]";
    }
}
