package stringandhashtable.algorithm;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentWords {

	/*
	 *  Given a composition with different kinds of words, return a list of the top K most frequent words in the composition.
	 */
	
	public String[] words(String[] input, int k) {
		if (input == null || input.length == 0) {
			return new String[0];
		}
		Map<String, Integer> freqMap = new HashMap<>();
		for (String s : input) {
			Integer freq = freqMap.get(s);
			if (freq == null) {
				freqMap.put(s, 1);
			} else {
				freqMap.put(s, freq + 1);
			}
		}
		PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
			if (minHeap.size() < k) {
				minHeap.offer(entry);
			} else {
				if (minHeap.peek().getValue() < entry.getValue()) {
					minHeap.poll();
					minHeap.offer(entry);
				}
			}
		}
		String[] result = new String[k];
		for (int i = k - 1; i >= 0; i--) {
			result[i] = minHeap.poll().getKey();
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
