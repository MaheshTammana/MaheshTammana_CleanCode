package cleancode;

public class HouseRent {
	double amount;
	double Calculate(String h,double area)
	{
		if( h.equals("standard materials"))
		{
			amount=area*1200;
		}
		else if(h.equals("above standard materials"))
		{
			amount=area*1500;
		}
		else if(h.equals("automated"))
		{
			amount=area*2100;
		}
		else if(h.contentEquals("high standard materials"))
		{
			amount=area*1800;
		}

		return amount;
	}
}
