
package array;
import java.util.Arrays;
public class rigthroatate {

	public static void main(String[] args) {
		int a[]= {12,13,14,15,46};
		int temp= a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
		   a[i]=a[i -1 ];
		}
	a[0]=temp;
	//for(int i=0;i<a.length;i++)
		System.out.print(Arrays.toString(a));
	}

}
