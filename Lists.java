package Lists;
import java.util.ArrayList;

public class Lists {

	public ArrayList<Integer> getMyList() {
	
		ArrayList<Integer> myList = new ArrayList<Integer>();
				
		for (int i=0; i<10; i++) {
			int randomNum = (int) (Math.random()*101);
			myList.add(randomNum);
			
		}
		
		System.out.println("This is the randomly generated list: " + myList);	
		//myList.sort(null);
		//System.out.println("This is the list after sorting: " + myList);
		
		return myList;
	}
	
	
	public static void main(String[] args) {
		
		Lists RandomNumberList = new Lists();
		ArrayList<Integer> myList = RandomNumberList.getMyList();
		
		getSplit split = new getSplit();
		getNumbers numbers = new getNumbers();
		getBubbleSort sort = new getBubbleSort();
		
		numbers.getHighest(myList);
		numbers.getLowest(myList);
		numbers.getEven(myList);
		split.getSplitted(myList);
		sort.getSort(myList);
		
		
	}
}
