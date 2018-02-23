package cn.lightfish.design_patterns.creational.simple_factory;

public class Administrator extends User
{
	public Administrator()
	{
		System.out.println("Administrator appear");
	}
	
	public void work()
	{
		System.out.println("i am a bug");
	}
}