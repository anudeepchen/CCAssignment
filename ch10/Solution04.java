

/**
 * Below functions defines a array like data structure Listy which works like a list but
 * doesnt have size method.
 * Function returns the index of the element in the list
 */
import java.util.ArrayList;

public class Solution04 {

	public static void main(String[] args) {

		Listy lst = new Listy();

		int value = 49;

		for (int i = 0; i < 60; i++) {
			lst.addElem(i);
		}
		int index = 1;
		while (lst.elementAt(index) != -1 && lst.elementAt(index) < value) {
			index = index * 2;
		}
	
		System.out.println(binSearch(lst,index/2,index,value));
	
	}


	public static int binSearch(Listy lst,int left,int right, int value){
		if(left >= right)
			return -1;
		else {
			int mid = (left + right)/2;	
		if(lst.elementAt(mid) == value)
			return mid;
		else if(lst.elementAt(mid) > value || lst.elementAt(mid) == -1)
			return binSearch(lst,left,mid-1,value);
		else 
			return binSearch(lst,mid+1,right,value);
	}
	}
	}
class Listy {

	ArrayList<Integer> lst = null;
	int maxSize = 50;

	Listy() {
		lst = new ArrayList<Integer>();
	}

	public void addElem(int x) {
		lst.add(x);
	}

	public int elementAt(int x) {
		if (x > maxSize)
			return -1;
		else
			return lst.get(x);
	}
}