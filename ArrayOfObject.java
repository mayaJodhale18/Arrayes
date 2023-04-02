package array;


class student
{
	int mark;
	String name;
	

public  student(String name,int mark)
{super();
	this.name=name;
	this.mark=mark;
	
	
}

public class ArrayOfObject {
	
	public static void main(String[] args) {
		student s1=new student( "maya",200);
		student s2=new student( "pooja",8700);
		student s3=new student("poonam",50);
		student s4=new student("ma",10);
		
		student s[]= {s1,s2,s3,s4};
		for(int i=0;i<s.length;i++)
			System.out.println(s[i].name+ " "+s[i].mark);

		
	}


}
}