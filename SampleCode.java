package seleniumPractice;

public class SampleCode {

	public static void main(String[] args) {
		System.out.println(status("on", 24));
		System.out.println(status("on", 14));
		System.out.println(status("off", 4));
		System.out.println(status("off", 14));

	}

	public static String status(String swt, int temp) {
		String stat;
		if (swt.equalsIgnoreCase("on")) {
			if (temp >= 23) {
				stat = "off";
			} else {
				stat = "on";
			}
		} else {
			if (temp < 5) {
				stat = "on";
			} else {
				stat = "off";
			}
		}

		return stat;

	}

}