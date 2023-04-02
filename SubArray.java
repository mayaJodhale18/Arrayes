
package array;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,32,22,23,4,3};
		//int SizeOfsubArray=4;
		int k=4;
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<=a.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+a[j];
			}
			int avg=sum/k;
			if(avg<min)
			{

				min=avg;
				index=i;
			}
		}
		System.out.println(min);
		System.out.println(index);
	}

}


