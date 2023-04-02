package array;

public class removeDublicate{
	public static void main(String args[])
	{
		int a[]= {1,2,3,2,1,3,4,8};

		int uni=0;
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
				uni++;
			}
		}
		System.out.println(uni);
		/**** int  [] uniarray=new int[uni];
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
 		uniarray[uniindex++]=a[i];
 	    }
     }
     for(int i=0;i<uniarray.length;i++)
     {
    	 System.out.print(uniarray[i]+" ");
     }*///
	}
}
