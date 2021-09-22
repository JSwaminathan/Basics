package com.jaa.billing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonUtils {
	private static String getFileName(String name) {
		String fileName = "C:\\Users\\ashwi\\Programming\\dependencies\\Data\\" + name + ".json";
		return fileName;

	}

	protected static String readJsonFile(String name) {
		String jsonString;
		// this method is reading the json file.

		String fileName = getFileName(name);

		File jsonFile = new File(fileName);
		if (jsonFile.exists()) {
			System.out.println(jsonFile + " exists");

		} else {
			System.err.println("does not exist" + jsonFile.toString());
			throw new RuntimeException("file does not exist");
		}
		try {
			Scanner scanner = new Scanner(jsonFile);
			StringBuffer buffer = new StringBuffer();
			String line;
			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				buffer.append(line);
			}
			scanner.close();
			System.out.println("buffer content" + buffer.toString());
			jsonString = buffer.toString();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			throw new RuntimeException("file does not exist");
		}
		return jsonString;
	}
}
