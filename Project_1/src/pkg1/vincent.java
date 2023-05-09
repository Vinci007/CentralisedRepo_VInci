package pkg1;

public class vincent 
{
	
		public int sum(int a,int b) //non void method for sum
		{
			int r;
			r=a+b;
			System.out.println("sum result is "+r);
			return r;
			
		}
public int sub(int i, int j) //non void method for sub
{
	int h;
	h=i-j;
	System.out.println("value is "+h);
	return h;
}
public void multi(int x, int y) //void method for multi
{
	int result;
	result=x*y;
	System.out.println("final result is "+result);

}
public static void main(String[] args)
{
	vincent obj=new vincent();
	int sumresult=obj.sum(10,2);
	int subresult=obj.sub(10,2);
	obj.multi(sumresult, subresult);
	
}

}
