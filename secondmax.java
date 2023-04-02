package array;

public class secondmax {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		int a[]= {-8,44,44,32,544,33};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
			if(a[i]!=max&& a[i]>max2)
				max2=a[i];
		

		System.out.println(max);
		System.out.println(max2);
			}

	
		

	}

