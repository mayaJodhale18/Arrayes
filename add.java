package array;

public class add {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[][]= {
				{1, 2,3},
				{1,2,3},
				{1,2,3},
		};
		int sum=0;
		sum=loopi(0,sum,a);
		System.out.println(sum);
	}

	private static int loopi(int i, int sum, int[][] a) {
		if(i<a.length)
		{
			return loopj(i,0,sum,a);
		}
		return sum;

	}

	private static int loopj(int i, int j, int sum, int[][] a) 
	{
		if(j<a.length)
		{
			sum=sum+a[i][j];	
		
		return loopj(i,++j,sum,a);
	}
	return sum;
	}
}
