package array;

public class removSpicific {

	public static void main(String[] args) {
		int a[]= {23,4,3,53};
		int ele=4;
		ele=loopi(0,ele,a);
	int i = 0;
	System.out.println(a[i]);
		//for(int i=0;i<a.length;i++)
		//{
			//if(a[i]!=ele)
			//	System.out.println(a[i]);
		//}
	}

	private static int loopi(int i, int ele, int[] a) {
if(i<a.length)
{
if(a[i]!=ele)

{
i++;
 return loopi(i,ele,a);
}
}

return ele;
	}

}
