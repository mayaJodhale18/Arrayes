package array;

public class SadalPoint {

	public static void main(String[] args) {
		int a[][]=
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}	
			};
		boolean isSadalPont=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				boolean issmallR=true;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][j]>a[i][k])
						issmallR=false;
				}
				boolean islaC=true;
				for(int k=0;k<a.length;k++)
				{



					if(a[i][j]<a[k][j])
						islaC=false;
				}
				if(islaC==true && issmallR==true)
				{
					System.out.println(a[i][j]);
					isSadalPont=true;

				}

			}

		}
		if(isSadalPont==false)
		{
			System.out.println("not found");	
		}
	}

}
