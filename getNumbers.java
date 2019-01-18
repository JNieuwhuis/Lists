package Lists;
import java.util.ArrayList;

public class getNumbers {

	public void getHighest(ArrayList<Integer> myList) {
		
		myList.sort(null);
		int highest = myList.get(myList.size()-1);
		System.out.println("This is the highest value in the list: " + highest);
		
		}
	
	public void getLowest(ArrayList<Integer> myList) {
		
		myList.sort(null);
		int lowest = (myList.get(0) + myList.get(1));
		System.out.println("This is the lowest two values added: " + lowest);
	}
	
	public void getEven(ArrayList<Integer> myList) {
		System.out.print("These are the even numbers in this list: ");
		
		for (Integer item : myList) {
			if (item % 2 == 0) {
				System.out.print(item + " ");
			}
		}
		System.out.println(" ");
	}
		
}
