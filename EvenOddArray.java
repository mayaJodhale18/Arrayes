package array;

import java.util.Arrays;
	public class EvenOddArray {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a[]= {1,45,32,24,66,75,33};
	int evenarraysize=0;
	int oddarraysize=0;
	for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
			evenarraysize++;
		
		
		else
			oddarraysize++;
		
		}
	System.out.println(evenarraysize + " "+oddarraysize);
	int [] evenarray =new int[evenarraysize];
	int [] oddarray =new int[oddarraysize];
	
	int evenindex=0;
	 int oddindex=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
			evenarray[evenindex++]=a[i];
		else
			oddarray[oddindex++]=a[i];
		
	}
	
	System.out.println(Arrays.toString(evenarray));
	System.out.println(Arrays.toString(oddarray));
	}
		
	
	}
