package array;
import java.util.Arrays;

public class praevenodd {

	public static void main(String[] args) {
int evencnt=0;
int oddcnt=0;
int a[]= {11,33,44,23,1,2,32};
for(int i=0;i<a.length;i++)
	{
	if(i%2==0)
		evencnt++;
	else
		oddcnt++;
	}
System.out.println(evencnt);
System.out.println(oddcnt);
int evenarry[]=new int[evencnt];
int oddarray[]=new int[oddcnt];
int evenindex=0;
int oddindex=0;
for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				evenarry[evenindex++]=a[i];
			}
			else
			{
				oddarray[oddindex++]=a[i];
			}
			
		}
System.out.println(Arrays.toString(evenarry));
System.out.println(Arrays.toString(oddarray));

	}
}

