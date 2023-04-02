package array;

public class DigonalSum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]a= {
		{5,1,3},
		{2,4,3},
		{4,3,2}
		
};
int sum=0;
for(int i=0;i<a.length;i++)
     {
	for(int j=0;j<a[i].length;j++)
		{
		if(j+i==2)
			{
			sum=sum+a[i][j];
			}
		}
	}
System.out.println(sum);
	}

}
