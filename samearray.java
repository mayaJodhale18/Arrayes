package array;

public class samearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {11,12,14,34,35,67};
int []b= {11,33,44,55,67,77};
int cnt=0;
	if(a.length==b.length)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i]) 
			{
				cnt++;
				break;
			}
		 }
			if(cnt==0)
				System.out.println("same");
			else
				System.out.println("not same");
			
	}
	else
	System.out.println("not same");
	}
	}

