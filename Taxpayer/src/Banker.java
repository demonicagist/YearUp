
public class Banker implements ITaxpayer{

	private double m_income = -1;
    private boolean  m_donePayingTaxes = false;
    
    public double GetIncome()
    {
    	return m_income;
    }
   Banker(double income)
   { 
    	SetIncome(income);
    	
   }
   

private void SetIncome(double income)
{
	m_income = income;
}


public void PayTaxes(double taxRate)
{
if (m_donePayingTaxes== false)
{
	double taxAmount =  taxRate;
	System.out.println("Banker is paying the following as tax: "+ taxAmount);
	SetIncome( taxAmount);
	System.out.println("My income after paying taxes is" + GetIncome());
}
}
	

  public void FileTaxReturn()
  {
	
  if (m_donePayingTaxes)
	
  {
	  System.out.println("Banker is filing his tax return");
  }

}
}