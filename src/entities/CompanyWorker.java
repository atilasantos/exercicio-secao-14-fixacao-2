package entities;

public class CompanyWorker extends Worker{

	private Integer employeesQuanitity;

	public CompanyWorker() {}
	
	public CompanyWorker(String name, Double yearIncome, Integer employeesQuantity) {
		super(name, yearIncome);
		this.employeesQuanitity = employeesQuantity;
	}
	
	public Integer getEmployeesQuanitity() {
		return employeesQuanitity;
	}

	@Override
	public Double taxCalculation() {

		Double totalTax = 0.0;
		if(employeesQuanitity > 10) {
			
			totalTax = getYearIncome() * 0.14;
		} else {
			
			totalTax = getYearIncome() * 0.16;
		}
		return totalTax;
	}
}
