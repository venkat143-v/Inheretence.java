class Add1 // parent  class1
{
	void add(int a, int b)
	{
		System.out.println("Add is "+(a+b));
	}
}
class Sub1  extends Add1// child class2
{	
	void sub(int x, int y)
	{
		System.out.println("Sub is "+(x-y));
	}
}
public class Inheretence// main class
{
	public static void main(String[] args) 
	{
		System.out.println("Main class");
		//creation of object		
		Sub1 s = new Sub1();
		s.add(10, 20);
		s.sub(33, 11);
	}
}