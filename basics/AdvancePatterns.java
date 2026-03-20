package dsa;

public class AdvancePatterns {
	public static void main(String[] args) {
		System.out.println("Butterfly Pattern");
		butterflyPattern(4);

		System.out.println("Solid Rhombus");
		solidRhombus(5);

		System.out.println("Number Pyramid");
		numberPyramid(5);

		System.out.println("Palindromic Pattern");
		palindromicPattern(5);

		System.out.println("Diamond Pattern");
		diamondPattern(4);
	}

	private static void diamondPattern(int n) {
		//top
		for(int i = 1; i <= n; i++) {
			//spaces
			for(int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			//stars
			for(int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//bottom
		for(int i = n; i >= 1; i--) {
			//spaces
			for(int j = (n-i); j >= 1; j--) {
				System.out.print(" ");
			}
            //stars
			for(int j = (2*i-1); j >= 1; j--) {
				System.out.print("*");
			}
		
			System.out.println();
		}

	}

	private static void palindromicPattern(int n) {
		for(int i = 1; i <= n; i++) {
			//spaces
			for(int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}

			//Number
			for(int k = i; k >= 1; k--) {
				System.out.print(k);
			}

			//Palindrom Number
			for(int k = 2; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println();	
		}

	}

	private static void numberPyramid(int n) {
		for(int i = 1; i <= n; i++) {
			//spaces
			for(int j = 1; j <= ((n-i)); j++) {
				System.out.print(" ");
			}

			//Number
			for(int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}

			System.out.println();			
		}

	}

	private static void solidRhombus(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= (i-1); j++) {
				System.out.print(" ");
			}

			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void butterflyPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for(int j = 1; j <= n; j++) {
				if(j >= (n-i+1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i = n; i > 0; i--) {
			for(int j = n; j > 0; j--) {
				if(j >= (n-i+1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for(int j = n; j > 0; j--) {
				if(j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}


}
