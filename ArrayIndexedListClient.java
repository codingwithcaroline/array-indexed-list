/**
 * Provides sample calls to ArrayIndexedList methods.
 *
 * @author Caroline Kirkconnell (CarolineKirkconnell8@gmail.com)
 * @version 2020-10-18
 */
public class ArrayIndexedListClient {

	/** Drives execution. */
	public static void main(String[] args) {
		
		ArrayIndexedList<String> list = new ArrayIndexedList<>(5);

		list.add("A");
		list.add("B"); 
		list.add("C");
		list.add("D");

		list = new ArrayIndexedList<>(5);
		list.add("A", 0);
		list.add("B", 1);
		list.add("C", 2);
		list.add("D", 3);

		list.add("E", 5);

		list.add("E", 1);
	}
}
