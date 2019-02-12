package week7_SimpleTable;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IO {
	public static List<String> read(String input) {
		Path path= Paths.get(input);
		try {
			Stream<String> stream= Files.lines(path, StandardCharsets.UTF_8);
			List<String> lines= stream.collect(Collectors.toList());
			stream.close();
			return lines;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new LinkedList<>();
	}
	
	static void write (Map<String, Integer> counter, String output) {
		Path path= Paths.get(output);
		List<String> lines= new  LinkedList<>();
		for(String token: counter.keySet())
			lines.add(token + " => " + counter.get(token));
		try {
			Files.write(path, lines, StandardCharsets.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		List<String> lines= IO.read("dat/input.txt");
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
