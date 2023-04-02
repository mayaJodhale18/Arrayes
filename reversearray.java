package array;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,34, 45,35,33, 32};
int i=0;
int j=a.length-1;
while(i<j)
	
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	for(int p =0;p<a.length;p++)
	System.out.print(a[p]+" ");
	}

}
