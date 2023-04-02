

package array;

public class ERPevenodd {

	public static void main(String[] args) {
		
		int []a= {11,12,3,56,7,8};
	int cnt=0;
int cnt1=0;
for(int i=0;i<a.length;i++)
 	{
	if(a[i]%2==0)
		cnt++;
	else
		cnt1++;
	
 	}
System.out.println("Even count "  +cnt);
System.out.println("odd count "   +cnt1);
System.out.println("Even array");
for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
				
		}
System.out.println("odd array");
for(int i=0;i<a.length;i++)
	if(a[i]%2!=0)
	System.out.println(a[i]);

	}

}
