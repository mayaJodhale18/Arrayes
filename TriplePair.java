package array;

public class TriplePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,1,3,4,7,9};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
			} 
		}
	}
	}

}
