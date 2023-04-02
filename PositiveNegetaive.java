package array;

import java.util.Arrays;

public class PositiveNegetaive {

	public static void main(String[] args) {
		
		int a[]={22,-23,13,543,-134,24,-23};// TODO Auto-generated method stub
for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<0 && a[j]>0)
			{
				int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			}
		}
	}
System.out.println(Arrays.toString(a));
	}


}
