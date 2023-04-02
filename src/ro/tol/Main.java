package ro.tol;


public class Main {


	public static  int  solve(int[][] input){
		for (int i=input.length-2;i>=0;i=i-1){
			for (int j=0;j<=i;j++){
				input[i][j]+=input[i+1][j]>input[i+1][j+1]?input[i+1][j]:input[i+1][j+1];
			}


		}
		return input[0][0];
	}

    public static void main(String[] args) {
	// write your code here
		int[] a1={1};
		int[] a2={2,3};
		int[]  a3={1,5,1};

		int[][] input=new int [][]{a1,a2,a3};
		System.out.println(solve(input));



	}
}
