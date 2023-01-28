package Pruefung;

public class diver 
{
	static final int maxTime = 90;
	static int totalTime = 0;
	int time = 0;
	boolean isLeft;
	
	diver(int time)
	{
		this.time = time;
		this.isLeft = true;
	}
	
	public static void resetTime()
	{
		totalTime = 0;
	}
	
	public void resetPos()
	{
		this.isLeft = true;
	}
	
	public static void addtotalTime(int time)
	{
		totalTime += time;
	}
	
	public static int getTotalTime()
	{
		return totalTime;
	}
	
	public int getTime()
	{
		return this.time;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}
	
	public void changeSide()
	{
		if(this.isLeft == false)
			this.isLeft = true;
		else
			this.isLeft = false;
	}
	
	public boolean isLeft()
	{
		return this.isLeft;
	}
}
