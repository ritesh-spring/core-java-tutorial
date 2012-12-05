package org.ritesh.file.operation;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxRepeatedWordCount {

	/**
	 * @param args
	 */

	public Map<String, Integer> getWordCount(String fileName) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " \".- ,;");
				while (st.hasMoreTokens()) {
					String temp = st.nextToken();
					if (wordMap.containsKey(temp)) {
						wordMap.put(temp, wordMap.get(temp) + 1);
					} else {
						wordMap.put(temp, 1);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return wordMap;
	}

	public List<Map.Entry<String, Integer>> sortByValue(
			Map<String, Integer> wordMap) {
		Set<Map.Entry<String, Integer>> set = wordMap.entrySet();
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
				set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxRepeatedWordCount mrwc = new MaxRepeatedWordCount();
		Map<String, Integer> wordMap = mrwc.getWordCount("d:/input.txt");
		List<Map.Entry<String, Integer>> list = mrwc.sortByValue(wordMap);
		/*for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "======" + entry.getValue());
		}*/
		System.out.println(list.get(list.size()-1));
		System.out.println(list.size());
		
	}

}
