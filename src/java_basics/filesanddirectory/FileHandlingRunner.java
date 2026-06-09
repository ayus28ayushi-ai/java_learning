package java_basics.filesanddirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandlingRunner {

	public static void main(String[] args) throws IOException {

		// reading files
		Path pathFileToRead = Paths.get("./src/java_basics/filesanddirectory/resourseSample/data.txt");
		Files.lines(pathFileToRead).forEach(System.out::println); // reads line by line

		System.out.println("\n\nInefficient way");
		List<String> list = Files.readAllLines(pathFileToRead); // load everything at once that might cause
																// OutOfMemoryError
		System.out.println(list);

		// writing in files
		Path pathFileToWrite = Paths.get("./src/java_basics/filesanddirectory/resourseSample/write.txt");
		List<String> list2 = List.of("I am learning how to write in files using java!!", "I am making progress");
		Files.write(pathFileToWrite, list2);

	}

}
