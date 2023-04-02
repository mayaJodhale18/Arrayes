package array;

public class minofarray {

	public static void main(String[] args) {
		int a[]={12,34,22,54,33 };// TODO Auto-generated method stub
for(int i=0;i<a.length;i++)
{
	int min=Integer.MAX_VALUE;
	 if(a[i]<min)
		 min=a[i];
}
	 
int min2=Integer.MAX_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<a.length;i++) {
if(a[i]!=min && min2<Integer.MAX_VALUE)
	min2=a[i];
}
System.out.println(min);
System.out.println(min2);
	}

}
