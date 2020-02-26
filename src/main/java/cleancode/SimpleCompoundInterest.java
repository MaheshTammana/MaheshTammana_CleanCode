package cleancode;

public class SimpleCompoundInterest {
	double Total=0,Total1=0;
	double SCalculate(double amount,double time,double rate)
	{
			Total=(time*amount*rate)/100;
		return Total;
	}
	double CCalculate(double amount,double time,double rate)
	{
	Total1=((rate*time)/100)+1;
	Total1*=amount;
	return Total1;
	}
	
}
