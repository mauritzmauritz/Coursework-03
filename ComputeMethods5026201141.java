import java.util.Random;
public class ComputeMethods5026201141 {
	public double fToC(double degreesF) {
		double degreesC;
		degreesC = 5/9*(degreesF-32);
		return degreesC;
	}
	public double hypotenuse(int a, int b) {
		double c = Math.hypot(a, b);
		return c;
	}
	public int roll() {
		Random dadu = new Random();
		int dadu1 = dadu.nextInt(6) + 1;
		int dadu2 = dadu.nextInt(6) + 1;
		int total = dadu1 + dadu2;
		return total;
	}
}