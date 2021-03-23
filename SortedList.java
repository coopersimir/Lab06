/**
 * Interface for the sorted list programs 
 * @author Simir Cooper
 * @since 3/18/21
 */
package Sorted_Functions;
public interface SortedList<T extends Comparable<T>> {
	public boolean add(T item);
	public T remove(int pos);
	public T get(int pos);
	public int size();

}
