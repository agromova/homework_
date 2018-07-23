package home.agromova.wordcounter;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {

        String inputFile = "/Users/allagromova/Library/Mobile Documents/com~apple~TextEdit/Documents/testGrep.rtf";
        if (args.length > 0) {
            inputFile = args[0];
        }

        LineNumberReader file = null;
        WordCounter counter = new WordCounter();
        String line;


        try {
            file = new LineNumberReader(new FileReader(String.valueOf(inputFile)));

            while ((line = file.readLine()) != null) {
                counter.countWords(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Cannot read '" + inputFile + "': " + e.getMessage());
        } finally {
            if (file != null) {
                file.close();
            }
        }
        System.out.println(counter.getWords());

    }
}
