package array;
import java.util.Arrays;
public class array14b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[]c = {'a','b','c','d','n','m'};
char[]c1={'x','y','z','w','n','m','o'};
char[]c3=new char[c.length+c1.length];
int c3index=0;
for(int i=0;i<c.length || i<c1.length ;i++)
	{
	if(i<c.length)
		c3[c3index++]=c[i];
	if(i<c1.length)
		c3[c3index++]=c1[i];
	}
System.out.println(Arrays.toString(c3));
	}
}
