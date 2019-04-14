package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double d = population * growthRate;
		double e = growthRate/2;
		return d*e;
	}
	
}
