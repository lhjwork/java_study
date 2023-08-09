package ch03;

public class FuelEffciency_test {
	
	static double fuelEff(double l, double km) {
		double fuelEff_value = km/l;
		return fuelEff_value;
	}

	public static void main(String[] args) {
		double result = fuelEff(8.86, 182.736);
		result = Math.round(result);
		System.out.println(result + " Km/L");
	}

}
