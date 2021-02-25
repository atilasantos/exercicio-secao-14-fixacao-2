package entities;

public class IndividualWorker extends Worker{

	private Double healthCosts;
	
	public IndividualWorker() {}
	
	public IndividualWorker(String name, Double yearIncome, Double healthCosts) {
		super(name, yearIncome);
		this.healthCosts = healthCosts;
	}
	
	public Double getHealthCosts() {
		return healthCosts;
	}

	public void setHealthCosts(Double healthCosts) {
		this.healthCosts = healthCosts;
	}

	@Override
	public Double taxCalculation() {
		
		Double totalTax = 0.0;
		if(getYearIncome() < 20000.00) {
			
			totalTax = getYearIncome() * 0.15;
		} else {
			
			totalTax = getYearIncome() * 0.25;
		}
		
		if(healthCosts > 0) {
			
			totalTax -= healthCosts * .5;
		}
		return totalTax;
	}

}
