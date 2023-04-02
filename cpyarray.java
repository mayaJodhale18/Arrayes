package array;

public class cpyarray {

	public static void main(String[] args) {

int []a= {11,22,44,55,56,9};
int []b=new int[a.length];
for(int i=0;i<a.length;i++)
{
b[i]=a[i];	

}
for(int i=0;i<a.length;i++)
	System.out.println(b[i]);
	}

}
