public class Main {

	public static void main(String[] args) {
		show("Version 1: " + VERS_ONE);
		show("Version 2: " + VERS_TWO);
		show("Ok, let's define the old version!");
		compareVersion(VERS_ONE, VERS_TWO);
		}

	private static String VERS_ONE = "8.1.13.41";
	private static String VERS_TWO = "8.1.009.125";

	public static void compareVersion(String VERS_ONE, String VERS_TWO) {
		String[] v1 = VERS_ONE.split("\\.");
		String[] v2 = VERS_TWO.split("\\.");
		for (int i = 0; i < 4; i++) {
			if (Integer.parseInt(v1[i]) == Integer.parseInt(v2[i])) {
				show(v1[i] + " = " + v2[i] + " check next num ↓");
				continue;
			}
			else if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])) {
				show(v1[i] + " < " + v2[i]);
				show("Version N1 (" + VERS_ONE + ") is old.");
				break;
			}
			else {
				show(Integer.parseInt(v1[i]) + " > " + Integer.parseInt(v2[i]));
				show("Version N2 (" + VERS_TWO + ") is old.");
				break;
			}
		}
	}

	private static void show(String result) {
		System.out.println(result);
	}

}
