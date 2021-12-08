package izuzeci;

public class Circle {
	private int radius;

	public Circle() {
	}

	public void setRadius(int r) throws Exception {
		if (r >= 0) {
			radius = r;
		} else
			throw new Exception("Vrednost poluprecnika ne moze biti negativan broj!");
	}

}

