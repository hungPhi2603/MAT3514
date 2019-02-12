package week7_SimpleTable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author hung Nov 13, 2018 4:25:11 PM
 */
 public class WordCounter {
	private Map<String, Integer> counter= new HashMap<>();
	
	void process(String line) {
		String tokens[]= line.split("[\\s?,)(.]+");
		for (String token : tokens) {
			if(counter.containsKey(token))
				counter.put(token, counter.get(token)+1);
			else counter.put(token, 1);
		}
	}
	
	void process(List<String> lines) {
		for (String line: lines)
			process(line);
	}
	
	public Map<String, Integer> filter (int minFrequency) {
		Map<String, Integer> result= new HashMap<>();
		for (String token : counter.keySet()) {
			Integer c= counter.get(token);
			if (c >= minFrequency)
				result.put(token, c);
		}
		return result;
	}
	
	public Map<String, Integer> getCounter() {
		return counter;
	}
	
	void show() {
		for (String token : counter.keySet()) {
			System.out.println(token+" => "+counter.get(token));
		}
	}
	
	public static void main(String[] args) {
		WordCounter wc= new WordCounter();
		List<String> lines= IO.read("dat/input.txt");
		wc.process(lines);
		System.out.println("#(tokens) = " + wc.getCounter().size());
//		wc.show();
		
		Map<String, Integer> frequentTokens= wc.filter(3);
		System.out.println("#(tokens) = " + frequentTokens.size());
		System.out.println(frequentTokens);
		IO.write(frequentTokens, "dat/output.txt");
	}
}
