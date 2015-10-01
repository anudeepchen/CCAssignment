/**
 * The below function merges two sorted Arrays 
 * @author Anudeep
 *
 */
public class Solution01 {

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	     
			while(m !=0 && n!=0){		
				if(nums1[m-1] > nums2[n-1]){	
				nums1[m+n-1] = nums1[m-1];
				m--;
				}
				else{
					nums1[m+n-1] = nums2[n-1];
					n--;
				} 
			}
			
			if( n != 0){
			for(int i = 0; i<n;i++){
				nums1[i] = nums2[i];
			}
			}
			else{
				for(int i = 0; i<m;i++){
					nums1[i] = nums1[i];
				}
				
			} 
	    
	 for(int i = 0; i < nums1.length-1;++i){
		 System.out.println(nums1[i]);
	 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] B= {1,5,7,8,10};
		int [] A = new int[10];
	
	for(int i = 0; i < B.length-1; ++i){
		A[i] = i*2;
	}
	
	merge(A, 4, B, 5);
	
	}

}
