/*
class ObjectException extends RuntimeException
{
	public String toString()
	{
		return "NoMoreThanTwoObects!";
	}
}





class PrimeMinister
{
    private static int count=0;
	
	String name="LOL";
	private PrimeMinister(){};		
	

    public static PrimeMinister CreateObject() 
	{
		if(count<2)
		{
			PrimeMinister ob=new PrimeMinister();
			count++;
			return ob;
		}
		else
		{

			System.out.println("Can't create more than two object!");
			return null;
		}
		
	}

}

class PrimeMinister_Demo
{
	public static void main(String[] args)
	{
		try
		{
		PrimeMinister ob1=PrimeMinister.CreateObject();
		System.out.println(ob1.name);
		PrimeMinister ob2=PrimeMinister.CreateObject();
		System.out.println(ob2.name);
		PrimeMinister ob3=PrimeMinister.CreateObject();
		System.out.println(ob3.name);		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
*/

class Abc  //Singleton class
{
	private static Abc ob=new Abc();
	String name="LOL";
	int a=10;
	private Abc()
	{
	}
	
	public static Abc getInstance()
	{
		return ob;
	}
}
class PrimeMinister_Demo
{
	public static void main(String[] args)
	{
		Abc ob=Abc.getInstance();
		System.out.println(ob.a);
		System.out.println(ob);
		Abc ob1=Abc.getInstance();
		ob1.name="AMAAL";
		System.out.println(ob.name);
		System.out.println(ob1.name);
		System.out.println(ob1);
	}
}

