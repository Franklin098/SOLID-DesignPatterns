package SOLID.SRP;

import java.io.File;
import java.io.PrintStream;

/**
 * Persistence
 */
public class Persistence {

    public void saveToFile(Journal journal, String filename, boolean overwrite) {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            } catch (Exception e) {
                // do some logging
                System.out.println("Error while saving journal to file :" + e.getCause());
            }
        }

    }

    public void loadFile(Journal journal, String filename) {
        // ...
    }

    public void loadFromUrl(Journal journal, String url) {
        // ..
    }

}