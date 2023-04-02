package array;

public class PrintOuterElement {

	public static void main(String[] args) {
int [][]b= {
		{1,2,3,4},
		{5,4,6,7},
		{9,1,8,7},
		{1,1,2,3}
		
};
for(int i=0;i<b.length;i++)
	{
	for(int j=0;j<b[i].length;j++)
		{
		if(i==0 ||i==3||j==0 ||j==3 )
		System.out.print(b[i][j]+" ");
		}
	System.out.println();
	}

	}
}
