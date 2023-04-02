package array;

public class Queen{
	private int []a=new int[5];
	private int index=0;
	public int pop()
	{
		
		if(index==0)
		{
			System.out.println("Queen is empty");
			return 0;
		}
		else
		{
	       //s
			
			index--;
		return a[index];
		
		//queen
		/*int temp=a[0]; 
			for(int i=0; i+1<index;i++)
				a[i]=a[i+1];
			
		index++;
			return temp;
			*/
		}
	}
	public void push(int num)
	{
		
		if(index<a.length)
		{
			
			a[index]=num;
			index++;
		}
		else
		{
			System.out.println("queen is full");
		}
	}
}
