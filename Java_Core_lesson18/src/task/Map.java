package task;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Map<K,V> {

	private List<MyEntry<K,V>> entries = new ArrayList<>();
	
	
	public void put(K key, V value) {
		entries.add(new MyEntry<>(key, value));
	}
	
	public void remuveByKey(K key) {
		entries.removeIf(entry -> entry.getKey().equals(key));
	}
	
	public void remuveByValue(V value) {
		entries.removeIf(entry -> entry.getValue().equals(value));
	}
	
	public void keySet(){
		for(MyEntry<K, V> entry :  entries) {
			System.out.println(entry.getKey());
		}
	}
	
	public void values() {
        for (MyEntry<K, V> entry : entries) {
            System.out.println(entry.getValue());
        }
    }
	
	public void printMap() {
        for (MyEntry<K, V> entry : entries) {
            System.out.println(entry);
        }
    }
}
