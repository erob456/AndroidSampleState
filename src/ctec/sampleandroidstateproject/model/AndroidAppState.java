package ctec.sampleandroidstateproject.model;

import android.app.Application;

public class AndroidAppState extends Application
{
	private String name;
	private String age;
	private String phrase;
	private String stuff;
	
	public void onCreate()
	{
		super.onCreate();
		
		name = "";
		age = "";
		phrase = "";
		stuff = "";
	}
	
	
	
	public String getName()
	{
		return name;
	}
	public String getAge()
	{
		return age;
	}
	public String getPhrase()
	{
		return phrase;
	}
	public String getStuff()
	{
		return stuff;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}
	public void setStuff(String stuff)
	{
		this.stuff = stuff;
	}
}
