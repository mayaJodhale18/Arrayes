package array;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,5,345,4,46,45,22,11};
for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])//5>345
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
System.out.println(Arrays.toString(a));
}

	}


