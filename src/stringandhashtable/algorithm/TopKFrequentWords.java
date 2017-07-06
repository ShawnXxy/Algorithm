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
	
	public String[] topK(String[] words, int k) {
		if (words == null || words.length == 0) {
			return new String[0];
		}
		Map<String, Integer> freqMap = new HashMap<>();
		for (String s : words) {
			Integer freq = freqMap.get(s);
			if (freq == null) {
				freqMap.put(s, 1);
			} else {
				freqMap.put(s, freq + 1);
			}
		}
		PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				// TODO Auto-generated method stub
				return e1.getValue().compareTo(e2.getValue());
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
		String[] result = new String[minHeap.size()];
		for (int i = minHeap.size() - 1; i >= 0; i--) {
			result[i] = minHeap.poll().getKey();
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
