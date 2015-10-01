/**
 * Below function generates an integer that is not contained in the input file
 */


/**
 * Below function generates an integer that is not contained in the file
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Solution07 {
public static void main(String[] args) throws FileNotFoundException {
	
	byte[] bit = new byte[Integer.MAX_VALUE+1];
	
	Scanner input = new Scanner(new FileReader("sample.txt"));
	
	while(input.hasNext()){
		int num = 0;
		bit[num/8] |= 1 <<(num%8);
	}

for(int i = 0; i < bit.length; i++){
	for(int j = 0; j < 8; j++){
		if((bit[i] & (1<<j)) == 0){
			System.out.println(i * 8 + j);
			return;
		}
	}
}

}
}
