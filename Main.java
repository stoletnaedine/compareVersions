public class Main {

	public static void main(String[] args) {
		show("Ok, let's check new version!");
		show("Version 1: " + VERSION_ONE);
		show("Version 2: " + VERSION_TWO);
		compareVersion(VERS_ONE, VERS_TWO);
		}

	private static String VERSION_ONE = "8.000012.22.1312312";
	private static String VERSION_TWO = "8.012.00022.1123121";
	private static String VERS_ONE = VERSION_ONE + ".";
	private static String VERS_TWO = VERSION_TWO + ".";

	public static void compareVersion(String VERS_ONE, String VERS_TWO) {
		int v1 = strToInt(firstNum(VERS_ONE));
		int v2 = strToInt(firstNum(VERS_TWO));
		if (v1 == v2) {
			show(v1 + " = " + v2 + " and check next num ↓");
			compareVersion(otherNum(VERS_ONE), otherNum(VERS_TWO));
		}
		else if (v1 > v2) {
			show(v1 + ">" + v2);
			show("Version N1: " + VERSION_ONE + " is new.");
		}
		else if (v1 < v2) {
			show(v1 + "<" + v2);
			show("Version N2: " + VERSION_TWO + " is new.");
		}
	}

	private static int findDot(String version) {
		int indexDot = version.indexOf(".");
		return indexDot;
	}

	private static String firstNum(String v) {
		int start = 0;
		int end = findDot(v);
		char[] prev = new char[end - start];
		v.getChars(start, end, prev, 0);
		return new String(prev);
	}

	private static String otherNum(String v){
		int start = findDot(v) + 1;
		int end = v.length();
		char[] next = new char[end - start];
		v.getChars(start, end, next, 0);
		return new String(next);
	}

	private static int strToInt(String str) {
		int x = Integer.parseInt(str);
		return x;
	}

	private static void show(String result) {
		System.out.println(result);
	}

}
