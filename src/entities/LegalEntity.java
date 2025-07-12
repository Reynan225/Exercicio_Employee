package entities;

public class LegalEntity extends Contributor {

	public static final double TAX_16 = 0.16; // se tiver <= 10 funcionários
	public static final double TAX_14 = 0.14; // se tiver < 10 funcinários

	private Integer employee;

	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer employye) {
		super(name, annualIncome);
		this.employee = employye;
	}

	public Integer getEmployye() {
		return employee;
	}

	public void setEmployye(Integer employye) {
		this.employee = employye;
	}

	@Override
	public double tax() {

		double sum = 0.0;

		if (employee > 10) {

			sum += getAnnualIncome() * TAX_14;
		} else {
			sum += getAnnualIncome() * TAX_16;
		}

		return sum;
	}

}