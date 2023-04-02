package array;

public class MaxInMatrix {

	public static void main(String[] args) {
		int[][]b= {
				{2,3,4},
				{45,2,23},
				{100,55,43}
		};
		int max=Integer.MIN_VALUE;
		max=loopi(0,b,max);
		System.out.println(max);

	}

	private static int loopi(int i, int[][] b, int max)
	{
		if(i<b.length)
		{
			int j=0;
			max=loopj(i,j,b,max);
			i++;
			return loopi(i,b,max);
		}
		return max;
	}

	private static int loopj(int i, int j, int[][] b, int max) 
	{
		if(j<b[i].length)
		{

			if(b[i][j]>max)
			{
				max=b[i][j];
			}
			j++;
			return loopj(i,j,b,max);
		}
		return max;

	}

}
