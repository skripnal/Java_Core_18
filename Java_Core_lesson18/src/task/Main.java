package task;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, Number> map = new Map<>();
		
		map.put(1, 22);
		map.put(2, 23);
		map.put(3, 123.2);
		
		map.printMap();
		System.out.println("------");
		map.keySet();
		System.out.println("------");
		map.values();
		System.out.println("------");
		map.remuveByKey(1);
		map.printMap();
		System.out.println("------");
		map.remuveByValue(23);
		map.printMap();
		System.out.println("----------------------------------------");
		
		
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add((Integer) Integer.parseInt("42"));
		
		System.out.println(integerList);
	}

}
