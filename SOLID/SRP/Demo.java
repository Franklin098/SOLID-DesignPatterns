package SOLID.SRP;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("I criend today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);
    }
}