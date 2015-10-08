/**
 * Below function draws a horizontal line from (x1,y) to(x2,y)
 * @author Anudeep
 *
 */
public class Solution08 {

	
	
	public static void draw(byte[] screen, int w, int x1,int x2, int y){
		int offset = x1 % 8;
		 int first_byte = x1 / 8;
		 if (offset != 0) {
		 first_byte++;
		 }
		
		 int end_offset = x2 % 8;
		
		
		 int last_full_byte = x2 / 8;
		 if (end_offset != 7) {
		 last_full_byte--;
		 }
		
		 // Set full bytes
		 for (int b = first_byte; b <= last_full_byte; b++) {
		 screen[(w / 8) * y + b] = (byte) 0xFF;
		 }
		
		 // Create masks for start and end of line
		 byte start_mask = (byte) (0xFF >> offset);
		 byte end_mask = (byte) ~(0xFF >> (end_offset +1));
		
		 // Set start and end of line
		 if ((x1 / 8) == (x2 / 8)) { // xl and x2 are in the same byte
		 byte mask = (byte) (start_mask & end_mask);
		 screen[(w / 8) * y + (x1 / 8)] |= mask;
		 } else {
		 if (offset != 0) {
		 int bnumber = (w / 8) * y + first_byte - 1;
		 screen[bnumber] |= start_mask;
		 }
		if (end_offset != 7) {
		 int byte_number = (w / 8) * y + last_full_byte + 1;
		screen[byte_number] |= end_mask;
	}
}

	for(int i = 0; i < screen.length;i++){
		System.out.println(screen[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] screen = {0,1,0,0};
		
	draw(screen,2,1,3,1);

	}

	
}
