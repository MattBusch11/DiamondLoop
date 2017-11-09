public class DiamondLoop {
	/**Author: Matt Busch
	 * Date:11/9/2017
	 **/
	public static void main(String [] args) {
		/**Purpose: Call on the methods to execute
		 **/ 
		diamondShape();
		int x=100;
		int [] odds = oddNumbers(x);
		for(int i=0; i<x; i++) {
			System.out.println(odds[i]);
		}
		int [] evens = evenNumbers(x);
		for(int i=0; i<x; i++) {
			System.out.println(evens[i]);
		}
	}
	public static int [] oddNumbers(int n) {
		/**Purpose: To output 100 odd numbers and return them
		 **/ 
		int [] odds = new int[n];
		for(int i=0; i<n; i++) {
			odds[i]=(2*i)+1;
		}
		return odds;
	}
	public static int [] evenNumbers(int n) {
		/**Purpose: To output 100 even numbers and return them
		 **/ 
		int [] evens = new int[n];
		int i=1;
		do {
			evens[i]=2*i;
			i++;
		}while(i<n);
		return evens;
	}
	public static void diamondShape() {
		/**Purpose: To form a diamond shape made ot of *
		 **/ 
		int i =1;
		while(i<26) {
			switch(i) {
				case 3: case 7: case 8: case 9: case 11: case 12: case 13: case 14: case 15: case 17: case 18: case 19: case 23:
					System.out.print("*");
				break;
				default:
					System.out.print(" ");
			}
			if(i%5==0) {
				System.out.println();
			}
			i++;
		}
	}

}
