import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.SortedMap;

public class WordCount {
    List<String> myWordList;
    Map<String, Integer> myTreeMap;
    Map<String, Integer> myHashMap;
    ArrayList<Entry<String, Integer>> myEntryList;

    public WordCount() {
        myWordList = new ArrayList<>();
        myTreeMap = new TreeMap<>();
        myHashMap = new HashMap<>();
    }

    public void readFile(File fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(fileName);
            while (scanner.hasNext()) {
                String[] line = scanner.next().trim().split("[^a-zA-Z0-9']+");// \n\t\r,.;:!?(){}
                for (int i = 0; i < line.length; i++) {
                    if (line[i].length() > 0) {
                        myWordList.add(line[i].toLowerCase());
                    }

                }

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }

    }

    public void storeInMap(Map<String, Integer> map) {
        for (int i = 0; i < myWordList.size(); i++) {
            String word = myWordList.get(i);
            if (map.containsKey(word)) {
                int frequency = map.get(word);
                frequency++;
                map.put(word, frequency);
            }
            else {
                map.put(word, 1);
            }
        }
    }

    public void topFrequency(Map<String, Integer> map) {
        myEntryList = new ArrayList<Entry<String, Integer>>(map.entrySet());
        Collections.sort(myEntryList, new Comparator<Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> word1, Entry<String, Integer> word2) {
                // TODO Auto-generated method stub
                return word2.getValue().compareTo(word1.getValue());
            }

        });

    }

    public void topFrequency(int n) {
        long minTree = Long.MAX_VALUE;
        for (int j = 0; j < 10; j++) {
            System.out.println(" Using TreeMap");
            long startTime = System.currentTimeMillis();
            storeInMap(myTreeMap);
            topFrequency(myTreeMap);
            for (int i = 0; i < n && i < myEntryList.size(); i++) {
                System.out.println(myEntryList.get(i));
            }
            System.out.println("**********************************************");
            long endTime = System.currentTimeMillis();
            long time = endTime - startTime;
            if (time < minTree)
                minTree = time;
            myTreeMap.clear();

            myEntryList.clear();
        }
        
        long minHash = Long.MAX_VALUE;
        for (int j = 0; j < 10; j++) {
            System.out.println("Using HashMap");
            long startTime = System.currentTimeMillis();
            storeInMap(myHashMap);
            topFrequency(myHashMap);
            for (int i = 0; i < n && i < myEntryList.size(); i++) {

                System.out.println(myEntryList.get(i));
            }
            System.out.println("**********************************************");
            long endTime = System.currentTimeMillis();
            long time = endTime - startTime;
            if (time < minHash) {
                minHash = time;
            }

            myHashMap.clear();
            myEntryList.clear();
        }
        System.out.println("Best time for 10 runs using TreeMap( in miliseconds): " + minTree);
        System.out.println("Best time for 10 runs using HashMap( in miliseconds): " + minHash);

    }

}
