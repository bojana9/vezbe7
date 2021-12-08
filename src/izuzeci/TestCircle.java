package izuzeci;

public class TestCircle {

	public static void main(String[] args) {

		Circle krug = new Circle();
		try {
			krug.setRadius(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

