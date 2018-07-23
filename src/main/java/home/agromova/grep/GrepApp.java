package home.agromova.grep;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepApp {
    public static void main(String[] args) throws IOException{

        String inputFile = args[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to match: ");
        Pattern pattern = Pattern.compile(sc.next());
        Matcher matcher = pattern.matcher("");

        LineNumberReader myFile = null;
        String line;


        try {
            myFile = new LineNumberReader(new FileReader(inputFile));
            while ((line = myFile.readLine()) != null)
            {
                matcher.reset(line);
                if (matcher.find()) {
                    System.out.println(inputFile + ": " + line + myFile.getLineNumber());
                }
            }
        }
        catch (IOException e)
        {
            System.err.println("Cannot read '" + inputFile + "': " + e.getMessage());
        }
        finally {
            if (myFile != null) {
                myFile.close();
            }
        }

    }

    }





