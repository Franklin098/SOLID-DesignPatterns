package SOLID.SRP;

/**
 * Demo
 */
public class Main {

    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "../journal.txt";
        persistence.saveToFile(journal, filename, true);
    }
}