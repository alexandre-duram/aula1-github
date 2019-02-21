package course;

public class EscopoInicializacao {

	public static void main(String[] args) {

		double price = 400.00;

		double discount = 0;

		if (price < 200.00) {
			double discount1 = price * 0.1;
		} else {
			discount = 0;
		}

		System.out.println(discount);
	}

}
