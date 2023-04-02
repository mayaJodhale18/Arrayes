package array;

import java.util.Arrays;

public class inseartionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {33,22,11,44,66,55};// 12   22   34   35   2   4 
for(int i=1;i<a.length;i++)//       i                                22<12
	                       // j+1   j                          temp=a[i]
	{
		int temp=a[i];
		int j=i;
		for(;j>0;j--)
		{
			if(temp<a[j-1])//22<12
				{
				a[j]=a[j - 1];//22=12
				}
			else
			{
				break;
			}
		}
		a[j]=temp;//12=22
	}
System.out.println(Arrays.toString(a));


	}

}
