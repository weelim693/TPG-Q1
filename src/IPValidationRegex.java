import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IPValidationRegex {

	public static void main(String[] args) {
		IPValidationRegex obj = new IPValidationRegex();
		obj.getFile("IpAddress.txt");
		// System.out.println(obj.getFile("IpAddress.txt"));
	}

	private String getFile(String fileName) {
		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String tempLine = line;
				if (line.replaceAll("[^A-Za-z]+", "").length() > 3) {
					tempLine = tempLine.replaceAll("[Aa]", "0");
					tempLine = tempLine.replaceAll("[Bb]", "192");
					tempLine = tempLine.replaceAll("[Cc]", "168");
					tempLine = tempLine.replaceAll("[Dd]", "58");
					System.out.println(tempLine);
				}
				result.append(line).append("\n");
			}
			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();
	}
}
