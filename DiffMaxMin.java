package array;

public class DiffMaxMin {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,5,2,2};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];

			if(a[i]<min)
				min=a[i];

		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(max-min);
	}

}
