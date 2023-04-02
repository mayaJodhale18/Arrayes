package array;

public class FoundArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {10,20,30,40,50};
 int b=50;
 int cnt=0;
 for(int i=0;i<a.length;i++)
 {
if(a[i]==b)
{
	//System.out.println("found");
	cnt++;
break;
}
 }
 if(cnt==0)
	 System.out.println("not found");
 else
	 System.out.println("found");
 }
 

}
