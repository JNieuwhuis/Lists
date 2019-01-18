package Lists;
import java.util.ArrayList;

public class getBubbleSort {

	public void getSort(ArrayList<Integer> myList) {
		
		for (int i=0; i < myList.size(); i++) {
			
			for (int j=1; j < (myList.size() -i); j++) {
				
				if (myList.get(j-1) > myList.get(j) ) {
					int Temp = myList.get(j-1);
					myList.set((j-1), (int) myList.get(j));
					myList.set(j, (int) Temp);
				}
			}
		}
	
		System.out.println("This is the list after using the Bubble Sort algorithm: " + myList);
	}
}
	
