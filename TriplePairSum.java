package array;

public class TriplePairSum 
{

	public static void main(String[] args)
	{
			int a[]= {5,1,3,4,7};
		
			for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]<12)
						System.out.println(a[i]+ " "+a[j]+" "+a[k]);
				}
			}
		}
	}

}
