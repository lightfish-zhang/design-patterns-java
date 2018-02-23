package cn.lightfish.design_patterns.creational.simple_factory;

public abstract class User
{	
    public void say(){
        System.out.println("i am a user");
    }
	public abstract void work();
}