package array;

public class maxofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,44,44,32,544,33};
int max=a[0];
for(int i=0;i<a.length;i++)
	if(a[i]>max) //a[i]=(10,44,32,544,33 )> max)
		max=a[i];
        System.out.println(max);
	}

}


