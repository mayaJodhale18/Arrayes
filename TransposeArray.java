package array;

public class TransposeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]b={
				   {1,2,3},
			       {4,5,6},
				   {7,8,9},
		};
		for(int i=0;i<b.length;i++)
			{
			for(int j=0;j<b.length;j++)
				{
				System.out.print(b[j][i]+" ");//j i transpose array
				}
			System.out.println();
			}

	}

}
