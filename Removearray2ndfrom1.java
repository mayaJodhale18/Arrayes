package array;

public class Removearray2ndfrom1{

	public static void main(String[] args) {
		// Remove array 2nd from 1
		int []a= {1,1,1,1,1,2,2,3,4};
		int []b= {1,2,4};
		for(int i=0;i<b.length;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
					cnt++;
					if(cnt>=2)
						
				break;
			}
		
			int[] c=new int[a.length-cnt];
			int count=0;
			int index=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j] && count<2) 
				{
					count++;
				}
				else
				{
					c[index]=a[j];
					index++;
				}
			}

			a=c;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

