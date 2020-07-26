package epamtasktask4.Session4;
import java.lang.*;
import java.util.*;
public class Constru
{
	public double construct(double s,double ar)
	{
		double a=ar;
		if(s==2)
		{
			a=a*1200;
		}
		else if(s==4)
		{
			a=a*1500;
		}
		else if(s==6)
		{
			a=a*1800;
		}
		else if(s==8)
		{
			a=a*2500;
		}
		return a;
	}
}