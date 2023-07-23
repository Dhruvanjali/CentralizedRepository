package package2;

public class Assignmnt2 
{
	public int sum(int a , int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub( int a1 , int b1)
	{
	int c1=a1-b1;
	return c1;
	}
	public int multi(int a2 , int b2)
	{
		int c2=a2*b2;
		return c2;
	}
	public int div(int a3 , int b3)
	{
		int c3=a3/b3;
		return c3;
	}
	public static void main(String[] args){
		int a=10;
		int b=2;
		Assignmnt2 obj = new Assignmnt2 ();
		int result1 = obj.sum(a,b);
		int result2 = obj.sum(result1,b);
		int result3 = obj.sub(result2 , b);
		int result4 = obj.multi(result3 , b);
		int result5 = obj.div(result4 , b);
		System.out.println("(((((10+2)+2)-2)*2)/2) = "+result5);
		
	}

		
	
	
			
		
	}

