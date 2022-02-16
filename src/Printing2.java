


public class Printing2{
	public static void main(String...args) {
		
	int i = 1;
	int space = 8;
	
		while(i <= 4) {
			int x = 1;	
			int sp = 0;
			while(x <= i) {
				System.out.print("*");
				x++;
			 }						
		
		while(sp < space) {
			System.out.print(" ");
			sp++;
		}
		
			int e = 1;
			while(e <= i) {				
				System.out.print("*");				
				e++;				
			}		
			
			
			System.out.println();
			space -= 2;
			i++;
			
		}
			
			
		
	}
}

