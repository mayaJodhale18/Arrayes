package array;

public class DifferentWayofFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,22,33,55};
		int num=55;
		if(contains(a,num)==0)
			System.out.println("not p");
		else
			System.out.println("p");
	}


	private static int contains(int[]a,int num)
	{

		int cnt=0;
		for(int i=0;i<a.length;i++)
		{

			if(a[i]==num)
				cnt++;

		}
		return cnt;

	}
}
