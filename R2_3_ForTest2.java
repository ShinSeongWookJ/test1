package day03;

public class R2_3_ForTest2 {

	public static void main(String[] args) {
		for(int i=1;i<3;i++) {//2 행의조건
			for(int k=1;k<4;k++) {//3 열의조건
				System.out.println("i="+i+", k="+k);
			}
			System.out.println("-------------");
		}
		/*[1]
		 *   *****
		 *   *****
		 *   *****
		 *   *****
		 *   
		 *   4행5열
		 * 
		 * */
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		/* [2]
		 * 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 * 
		 * */
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		
		/*[3]
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****     
		 * 
		 * (0,0)(0,1)(0,2)(0,3)
		 * (1,0)(1,1)(1,2)(1,3)
		 * (2,0)(2,1)(2,2)(2,3)
		 * (3,0)(3,1)(3,2)(3,3)
		 * */
		System.out.println("-------------------");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i+j<3) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}//for
			System.out.println();
		}
		
		/* [4]
		 *    *
		 *   ***
		 *  *****  
		 * 
		 * (0,0)(0,1)(0,2)(0,3)(0,4)
		 * (1,0)(1,1)(1,2)(1,3)(1,4)
		 * (2,0)(2,1)(2,2)(2,3)(2,4)
		 * */
		System.out.println("-------------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if((i+j>=2) && (j-i<=2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for (int i = 0; i < 3; i++) {

	        for (int j = 2; j > i; j--) { 
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= i*2+1; k++) {
	            System.out.print("*"); 
	        }
	        System.out.println();
	    }
	}

}
