package entities;

public abstract class Worker {

	private String name;
	private Double yearIncome;
	
	public Worker () {}
	
	public Worker (String name, Double yearIncome) {
		this.name = name;
		this.yearIncome = yearIncome;
	}
	
	public String getName() {
		return name;
	}

	public Double getYearIncome() {
		return yearIncome;
	}

	public abstract Double taxCalculation();

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName() + ": $ ");
		sb.append(String.format("%.2f", this.taxCalculation()));
		return sb.toString();
	}
}
