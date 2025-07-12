package entities;

public class Individual extends Contributor{

	public static final double TAX_15 = 0.15; // 15 = 15%
	public static final double TAX_25 = 0.25; // 25 = 25%
	
	private Double healthSpending;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double tax() {
		
		double sum = 0.0;
		
		if (getAnnualIncome() < 20000) {
			sum += (getAnnualIncome() * TAX_15) - (healthSpending * 0.50);
					
		} else if (getAnnualIncome() >= 20000) {
			sum += (getAnnualIncome() * TAX_25) - (healthSpending * 0.50);
		}
		
		return sum;
	}

}