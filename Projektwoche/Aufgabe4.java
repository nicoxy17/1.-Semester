package projektwocheA;

public class Bruch 
{
	private int zaehler;
	private int nenner;
	
	Bruch(int zaehler)
	{
		this.zaehler = zaehler;
	}
	
	Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public int getZaehler()
	{
		return zaehler;
	}
	
	public int getNenner()
	{
		return nenner;
	}
	
	public void multipliziere(int n)
	{
		this.zaehler = this.zaehler *n;
	}
	
	public void multipliziere(Bruch b)
	{
		this.zaehler = this.zaehler * b.zaehler;
		this.nenner = this.nenner * b.nenner;
	}
	
	public void dividiere(Bruch b)
	{
		this.zaehler = this.zaehler * b.nenner;
		this.nenner = this.nenner * b.zaehler;
	}
	
	public String toString()
	{
		return this.zaehler+"/"+this.nenner;
	}
	
	public static int ggt(int a, int b)
	{
		boolean loesung = false;
		if(a<b)
		{
			for(int i = 1; i<a+1;i++)
			{
				int x = a/i;
				if(b%x==0)
					return x;
			}
		}
		return 0;
	}
	
	public void kuerze()
	{
		this.zaehler = this.zaehler / ggt(this.nenner, this.zaehler);
		this.nenner = this.nenner / ggt(this.nenner, this.zaehler);
	}
}
