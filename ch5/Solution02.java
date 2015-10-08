/**
 * Below function displays the binary reperesentation of the input double number
 * @author Anudeep
 *
 */
public class Solution02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 0.625;
		
		if(d > 1 || d < 0){
			System.out.println("Error");
		}
	
	
		StringBuilder bString = new StringBuilder();
		bString.append(".");
		
		while(d > 0){
			if(bString.length()>32){
				System.out.println("Error");
			}
		
			double num = d * 2;
			
			if(num >= 1){
				bString.append("1");
				d = num - 1;
			}
		
			else {
				bString.append("0");
				d = num;
			}
			
		}
		System.out.println(bString);
	
	}

}
