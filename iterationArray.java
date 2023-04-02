package array;

import java.util.Arrays;

public class iterationArray {

	public static void main(String[] args) {
char a[]= {'a','b','c','d'};
char b[]= {'w','x','y','o','p','o'};
char c[]=new char[a.length + b.length];
int cindix=0;
for(int i=0;i<a.length || i<b.length;i++)
		{
			if(i<a.length)
				c[cindix++]=a[i];
		    if(i<b.length)
		    	c[cindix++]=b[i];
				
		}
	System.out.println(Arrays.toString(c));
	}

}
