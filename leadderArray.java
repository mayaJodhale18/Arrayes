package array;

public class leadderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,89,43,54};
for(int i=0;i<a.length;i++)
	{
	int cnt=0;
	for(int j=i+1;j<a.length;j++)
		{
		if(a[i]<a[j])
		{
			cnt++;
			break;
			
		}
			
		}
	if(cnt==0)
		
	System.out.println(a[i]);
	}
	}

}
