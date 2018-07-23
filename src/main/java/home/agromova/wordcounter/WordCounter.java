package home.agromova.wordcounter;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    Map<String, Integer> hashMap;

    public WordCounter() {
        this.hashMap = new TreeMap<>();
    }

    public void countWords (String strToCountWords) {

        String[] s = strToCountWords.split("\\s+");

        for(int i = 0; i < s.length; i++) {
            s[i] = s[i].toLowerCase();
            int value = this.hashMap.getOrDefault(s[i], 0);
            this.hashMap.put(s[i], value + 1);
        }

    }

    public Map<String, Integer> getHashMap() {
        return hashMap;
    }

    public String getWords() {
        String result = "";

        for (Map.Entry<String, Integer> entry : this.hashMap.entrySet())
        {
            result += entry.getKey() + " - " + entry.getValue() + "\n";
        }
        return result;
    }

}
