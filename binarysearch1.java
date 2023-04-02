package array;

public class binarysearch1 {

	public static void main(String[] args) {
int a[]= {11,22,55,6,7};
int num=11;
int start=0;
int end=a.length-1;
while(start<=end)
		{
			int mid=(start+end)/2;
			//System.out.println(a[mid]);
					if(num==a[mid])
						{
						System.out.println("found index "+mid);
					   return;
					}
					else if(num>a[mid])
					{
						start=mid+1;
					}
					else
					{
						end=mid-1;
					}
					if(start>end)
					{
						System.out.println("not found ");
						return;
					}
		}

	}
	private static void loop(int[] a, int start, int end, int num) {
		{
			int mid=(start+end)/2;
					if(num==a[mid])
						{
						System.out.println("found index "+mid);
					   return;
					}
					else if(num>a[mid])
					{
						start=mid+1;
					}
					else
					{
						end=mid-1;
					}
					if(start>end)
					{
						System.out.println("not found ");
						return;
					}
					loop(a,start,end,num);	
		}
	}
	}


