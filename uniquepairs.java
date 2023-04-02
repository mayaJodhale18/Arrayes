package array;

public class uniquepairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3};
int unicnt=0;
		{
			for(int i=0;i<a.length;i++)
			{
				int cnt=0;
				for(int j=0;j<i;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
						break;
					}
					
				}
				if(cnt==0)
				{
					unicnt++;
				}
			}
			int b[]=new int[unicnt];
			int uniindex=0;
			for(int i=0;i<a.length;i++)
				{
				int cnt=0;
				for(int j=0;j<i;j++)
					{
					if(a[i]==a[j])
						{
						cnt++;
						break;
						}
					}
				if(cnt==0)
					{
						b[uniindex++]=a[i];
					
					}
				}
			for(int i=0;i<b.length;i++)
			{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]+b[j]==12)
				
					System.out.println(b[i]+" "+b[j]);
			}
				}
		}
	}
}/*	for(int i=0;i<uniarray.length;i++)
			}
					{
					for(int j=0;j<uniarray.length;j++)
					{
							System.out.println(uniarray[i]+" "+uniarray[j]);
						//if(uniarray[i] + uniarray[j]==7)
							//System.out.println(uniarray[i]+" "+uniarray[j]);
					}
					}
			
		}*/
	
