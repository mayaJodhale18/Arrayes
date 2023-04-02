package array;

public class Removedublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,1,2,3,5,8};
int uniquecnt=0;
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
		uniquecnt++;
	
	}
	}
System.out.println(uniquecnt);
int uniquearray[]=new int[uniquecnt];
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
	uniquearray[uniindex++]=a[i];
	}

}
for(int i=0;i<uniquearray.length;i++)

System.out.print(uniquearray[i]);


	}

}
