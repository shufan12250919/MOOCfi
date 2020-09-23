/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author linshu-fan
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private HashMap<String, String> reverse;
    private String filename;

    public SaveableDictionary() {
        dictionary = new HashMap<>();
        reverse = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        filename = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words) && !reverse.containsKey(words)) {
            dictionary.put(words, translation);
            reverse.put(translation, words);
        }
    }

    public String translate(String word) {
        if (dictionary.get(word) == null) {
            return reverse.get(word);
        }
        return dictionary.get(word);
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            reverse.remove(dictionary.get(word));
            dictionary.remove(word);
        } else {
            dictionary.remove(reverse.get(word));
            reverse.remove(word);
        }

    }

    public boolean save() {
        try (FileWriter load = new FileWriter(filename)) {
            for (String word : dictionary.keySet()) {
                load.write(word + ":" + dictionary.get(word) + "\n");
            }
            load.close();

        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
