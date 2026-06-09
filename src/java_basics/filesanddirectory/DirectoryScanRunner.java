package java_basics.filesanddirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");

		System.out.println("Files.list way");
		Files.list(currentDirectory).forEach(System.out::println);
		System.out.println("Files.walk way");
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 3).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attribute) -> String.valueOf(path)
				.contains(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attribute) -> attribute.isDirectory();

		System.out.println("\n\n\nFiles.find\n\n");
		Files.find(currentDirectory, 3, javaMatcher).forEach(System.out::println);
		System.out.println("\n\nAlternative");
		Files.find(currentDirectory, 3, directoryMatcher).forEach(System.out::println);

	}

}
