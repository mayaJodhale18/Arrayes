package array;

public class InnerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]b= {
				{1,2,3,4},
				{5,4,6,7},
				{9,1,8,7},
				{1,1,2,3}
				
		};
		int sum=0;
		int cnt=0;
		for(int i=0;i<b.length;i++)
			{
			for(int j=0;j<b[i].length;j++)
				{
				if(i!=0  && i!=b.length-1 && j!=0 &&j!=b.length-1 )
				{
					sum=sum+b[i][j];
				    cnt++;
				}
			}
		}
		double avg=sum/cnt;
		System.out.println(sum);
		System.out.println(avg);
	}

}
