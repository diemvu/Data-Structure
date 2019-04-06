import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author Diem Vu
 * @version winter 2019
 */
public class WordCount {
    /**
     * 
     * @param theFileName filename.
     * @return an arraylist
     */
    private ArrayList<String> readFile(final File theFileName) {

        final ArrayList<String> wordList = new ArrayList<>();
        final Scanner scanner;

        try {
            scanner = new Scanner(theFileName);
            while (scanner.hasNext()) {
                final String[] line = scanner.next().trim().split("[^a-zA-Z0-9']+");
                for (int i = 0; i < line.length; i++) {
                    if (line[i].length() > 0 && !line[i].equals("'")) {
                        wordList.add(line[i].toLowerCase());
                    }

                }

            }
            scanner.close();
        } catch (final FileNotFoundException e) {
            System.out.println("Exiting program: File Not Found");
            System.exit(0);
        }
        return wordList;

    }

    /**
     * 
     * @param theMap a map
     * @param theList a list
     * @return a map
     */
    private Map<String, Integer> storeInMap(final List<String> theList,
                                           final Map<String, Integer> theMap) {

        for (int i = 0; i < theList.size(); i++) {
            final String word = theList.get(i);
            if (theMap.containsKey(word)) {
                int frequency = theMap.get(word);
                frequency++;
                theMap.put(word, frequency);
            } else {
                theMap.put(word, 1);
            }
        }
        return theMap;
    }
    /**
     * 
     * @param theMap amap
     * @return return
     */
    private ArrayList<Entry<String, Integer>> topFrequency(final Map<String, Integer> theMap) {
        final ArrayList<Entry<String, Integer>> entryList =
                        new ArrayList<Entry<String, Integer>>(theMap.entrySet());
        Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

            @Override
            public int compare(final Entry<String, Integer> word1, 
                               final Entry<String, Integer> word2) {
                // TODO Auto-generated method stub
                return word2.getValue().compareTo(word1.getValue());
            }

        });
        return entryList;
    }
    /**
     * @param theFileName filename
     * @param theN n
     */
    public void topFrequency(final int theN, final String  theFileName) {
        final File file = new File(theFileName);
        final int ten = 10;
        final ArrayList<String> list = readFile(file);
        long minTree = Long.MAX_VALUE;
        for (int j = 0; j < ten; j++) {
            System.out.println("Using TreeMap");
            final long startTime = System.currentTimeMillis();
            final Map<String, Integer> treeMap = new TreeMap<String, Integer>();
            storeInMap(list, treeMap);
            final ArrayList<Entry<String, Integer>> entryList = topFrequency(treeMap);
            for (int i = 0; i < theN && i < entryList.size(); i++) {
                System.out.println(entryList.get(i));
            }
            System.out.println("*********************************************");
            final long endTime = System.currentTimeMillis();
            final long time = endTime - startTime;
            if (time < minTree) {
                minTree = time;
            }
            treeMap.clear();

            entryList.clear();
        }

        long minHash = Long.MAX_VALUE;
        for (int j = 0; j < ten; j++) {
            System.out.println("Using HashMap");
            final long startTime = System.currentTimeMillis();
            final Map<String, Integer> hashMap = new HashMap<String, Integer>();
            storeInMap(list, hashMap);
            final ArrayList<Entry<String, Integer>> entryList = topFrequency(hashMap);
            for (int i = 0; i < theN && i < entryList.size(); i++) {

                System.out.println(entryList.get(i));
            }
            System.out.println("**********************************************");
            final long endTime = System.currentTimeMillis();
            final long time = endTime - startTime;
            if (time < minHash) {
                minHash = time;
            }

            hashMap.clear();
            entryList.clear();
        }
        System.out.println("Using  " + theFileName + " and using TreeMap");
        System.out.println("Best time for 10 runs:  " + minTree + "ms ");
        System.out.println("Using " + theFileName + " and using HashMap");
        System.out.println("Best time for 10 runs: " + minHash + "ms");

    }

}
