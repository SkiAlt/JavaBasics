package CurrencyConverter;

public class CurrencyConverter {
	public double dollortoinr(double x) {
		double inr = x * 67.86;
		return inr;
	}

	public double inrtodollor(double x) {
		double dollor = x / 67.86;
		return dollor;
	}

	public double eurotoinr(double x) {
		double inr = x * 79.18;
		return inr;
	}

	public double inrtoeuro(double x) {
		double euro = x / 79.18;
		return euro;
	}

	public double yentoinr(double x) {
		double inr = x * 0.62;
		return inr;
	}

	public double inrtoyen(double x) {
		double yen = x / 0.62;
		return yen;
	}
}
