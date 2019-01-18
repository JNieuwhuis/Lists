package Lists;
import java.util.ArrayList;

public class getSplit {

	public void getSplitted(ArrayList<Integer> myList) {
		
		ArrayList<Integer> myListdiv2 = new ArrayList<Integer>();
		ArrayList<Integer> myListdiv3 = new ArrayList<Integer>();
		ArrayList<Integer> myListdiv5 = new ArrayList<Integer>();
		ArrayList<Integer> myListrem = new ArrayList<Integer>();
				
		for (Integer item : myList) {
			if (item % 5 == 0) {
				myListdiv5.add(item);
			}
			else if (item % 3 ==0) {
				myListdiv3.add(item);
			}
			else if (item % 2 ==0) {
				myListdiv2.add(item);
			}
			else {
				myListrem.add(item);
			}
		}
				
			System.out.println("This list contains the numbers that can be divided by 2: " + myListdiv2);
			System.out.println("This list contains the numbers that can be divided by 3: " + myListdiv3);
			System.out.println("This list contains the numbers that can be divided by 5: " + myListdiv5);
			System.out.println("This list contains all remaining numbers: " + myListrem);
	}
}
