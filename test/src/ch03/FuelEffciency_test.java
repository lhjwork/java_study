package ch03;

public class FuelEffciency_test {
	
	static double fuelEff(double l, double km) {
		int fuelEff_value = (int)(km/l);
		return fuelEff_value;
	}

	public static void main(String[] args) {
		double result = fuelEff(8.86, 182.736);
		System.out.println(result + " Km/L");
	}

}
