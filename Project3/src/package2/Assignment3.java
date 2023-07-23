package package2;

public class Assignment3 
{
	public int div (int a , int b) 
	{
		int c;
		c = a/b;
		return c;
	}
	public int sub (int a1 , int b1)
	{
		int c1;
		c1 = a1-b1;
		return c1;
	}
	public int sum (int a2 , int b2)
	{
     int c2;
     c2 = a2+b2;
     return c2;
	}
	public int multi (int a3 , int b3)
	{
		int c3;
		c3 = a3*b3;
		return c3;
	}
     public static void main(String[] args) 
     {
    	 int a = 10;
    	 int b = 2;
    	 Assignment3 obj = new Assignment3();
    	 int result1 = obj.div(a, b);
    	 int result2 = obj.sub(result1 , b);
    	 int result3 = obj.sum(result2, b);
    	 int result4  = obj.sub(result3, b);
    	 int result5  = obj.multi(result4, b);
    	 System.out.println("(((((10/2)-2+2)-2)*2) ="+result5);
    	 
     }}
   
    	 
    	 
    	 
    	 
