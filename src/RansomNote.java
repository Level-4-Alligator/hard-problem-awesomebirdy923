import java.util.*;

public class RansomNote {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;
	String mag;
	String not;

	public RansomNote(String magazine, String note) {
		mag = magazine;
		not = note;
		magazineMap = new HashMap();
		noteMap = new HashMap();

	}

	public boolean solve() {
		for (int i = 0; i < mag.split(" ").length; i++) {
			magazineMap.put(mag.split(" ")[i], i);
		}
		for (int i = 0; i < not.split(" ").length; i++) {
			noteMap.put(not.split(" ")[i], i);
		}
		// ---------------------------------------------------------
		ArrayList<String> magazine = (ArrayList<String>) magazineMap.keySet();
		ArrayList<String> note = (ArrayList<String>) noteMap.keySet();
		if (magazine.get(5)==note.get(5)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}