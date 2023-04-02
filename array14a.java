package array;
import java.util.Arrays;
public class array14a {
public static void main(String[] args) {
		// TODO Auto-generated method stub
char[]c1 = {'a','b','c','d'};
char[]c2={'x','y','z','w'};
char[]c3=new char[c1.length+c2.length];
int c3index=0;
for(int i=0;i<c3.length;i++)
	{
	c1[c3index++]=c1[i];
	
	c2[c3index++]=c2[i];
	
	}
System.out.println(Arrays.toString(c3));

	}
}
