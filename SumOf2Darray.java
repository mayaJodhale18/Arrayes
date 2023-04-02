package array;

public class SumOf2Darray {

	public static void main(String[] args) {
		int [][]b= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int sum=0;
		int cnt=0;
		for(int i=0;i<b.length;i++)
			{
			for(int j=0;j<b[i].length;j++)
			{
				sum=sum+b[i][j];
				cnt++;
				
			}		
			}
		System.out.println("sum of 2D array");
		System.out.println(sum);
	System.out.println("avg of 2D Array");	
		System.out.println(sum/cnt);
	}

}
