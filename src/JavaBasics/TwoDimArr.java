package JavaBasics;

public class TwoDimArr {

	public static void main(String[] args) {
	
		String s[][] = new String[3][4];
		int r = s.length;
		int c = s[0].length;
		
		System.out.println(r); // length of the row
		System.out.println(c); // length of the column
		
		s[0][0] = "A1";
		s[0][1] = "B1";
		s[0][2] = "c1";
		s[0][3] = "d1";
		
		s[1][0] = "A2";
		s[1][1] = "B2";
		s[1][2] = "c2";
		s[1][3] = "d2";
		
		s[2][0] = "A3";
		s[2][1] = "B3";
		s[2][2] = "c3";
		s[2][3] = "d3";
		
		
		
		
		// print the values in the form of the matrix
		for(int i=0;i<r;i++) {
			for(int j= 0;j<c;j++) {
			//	System.out.print(s[i][j]+" ");
				System.out.print("*"+" ");
				
				}
			System.out.println(" ");
			
		}

	}

}
