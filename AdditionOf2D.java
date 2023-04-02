package array;

public class AdditionOf2D {

	public static void main(String[] args) {
		int [][]a= {
				{1,2,3,4},
				{5,4,6,7},
				{9,1,8,7},
				{1,1,2,3}
				
		};
		int [][]b= {
				{1,2,2,4},
				{5,4,6,7},
				{9,1,8,7},
				{0,1,1,6}
				
		};
		
		int c[][]=new int[4][4];
		for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
				c[i][j]=a[i][j] + b[i][j];
				}
			}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
				
	}

}
