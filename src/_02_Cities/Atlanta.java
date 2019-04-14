package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double f = population * growthRate;
		double g = growthRate*2;
		return f*g;
	}

}
