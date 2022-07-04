package SOLID.singleresponsability;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add((++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // Breaks Single Responsability Principle
    // Now our Journal is also handling persistance, wich is not correct. Add this
    // methods in a separate Persistence class
    /*
     * public void save(String filename) {
     * try (PrintStream out = new PrintStream(filename)) {
     * out.println(toString());
     * }
     * }
     * 
     * public void loadFile(String filename) {
     * // ...
     * }
     * 
     * public void loadFromUrl(String url) {
     * // ..
     * }
     */
}