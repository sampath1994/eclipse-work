
public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         foo("Hello");
         foo(100);
         foo(107.54);
	}

	
	public static void foo(Object obj)
	{
		if(obj != null)
		{
			if(obj instanceof String)
			{
				System.out.println((String)obj);
			}
			if(obj instanceof Integer)
			{
				System.out.println((Integer)obj+10);
			}
			if(obj instanceof Double)
			{
				System.out.println((Double)obj + 10.32);
			}
		}
	}
}
