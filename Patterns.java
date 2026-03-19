package dsa;

public class Patterns {
	public static void main(String[] args) {
		System.out.println("solidRectangle");
		solidRectangle(4,5);

		System.out.println("Hallow Rectangle");
		hallowRectangle(4,5);

		System.out.println("Half Pyramid");
		halfPyramid(4);

		System.out.println("Inverted Half Pyramid");
		invertedHalfPyramid(4);

		System.out.println("Inverted Half Pyramid(ROTATED BY 180 DEG)");
		invertedHalfPyramid180(4);

		System.out.println("Half Pyramid with Number");
		halfPyramidNumber(5);

		System.out.println("Inverted Half Pyramid with Number");
		invertedHalfPyramidNumber(5);
		
		System.out.println("Floyd's Triangle");
		floydTriangle(5);
		
		System.out.println("0-1 Triangle");
		triangle_0_1(5);


	}

	private static void triangle_0_1(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if(((i+j) % 2) == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		
		
	}

	private static void floydTriangle(int n) {
		int num = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
	}

	public static void solidRectangle(int n, int m) {
		for(int i = 0 ; i < n ; i ++ ) {
			for(int j = 0 ; j < m ; j ++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void hallowRectangle(int n, int m) {
		for(int i = 0 ; i < n ; i ++ ) {
			for(int j = 0 ; j < m ; j ++ ) {
				if(i == 0 || j == 0 || i == (n-1) || j == (m-1) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void halfPyramid(int n) {
		for(int i = 1 ; i <= n ; i ++ ) {
			for(int j = 1 ; j <= i ; j ++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void invertedHalfPyramid(int n) {
		for(int i = n ; i > 0 ; i -- ) {
			for(int j = 0 ; j < i; j ++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void invertedHalfPyramid180(int n) {
		for(int i = 1 ; i <= n ; i ++ ) {
			for(int j = 1 ; j <= n; j ++ ) {
				if(j > (n-i)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void halfPyramidNumber(int n) {
		for(int i = 1 ; i <= n ; i ++ ) {
			for(int j = 1 ; j <= i ; j ++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void invertedHalfPyramidNumber(int n) {
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
