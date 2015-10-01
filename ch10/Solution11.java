
/**
 * Below function sorts the array into an alternating sequence of peaks and valleys
 */

import java.util.Arrays;


public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] a = {1,7,4,9,8,0};
			
			Arrays.sort(a);
			
			for(int i = 1;i <a.length; i = i+2){
				swap(a,i-1,i);
			}
	
			for(int i = 0;i <a.length; ++i){
				System.out.println(a[i]);
			}
	}

	public static void swap(int[] array,int first,int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

}
