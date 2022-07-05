package creational.builder.fluentinterface;

public class Main {

    public static void main(String[] args) {

        // StringBuilder help us to create a String object piecewise, step by step.
        // So instead of creating every single time a new String and concatenate it with
        // more strings, we can construct a single final String, one by one.
        StringBuilder sb = new StringBuilder();

        String[] words = { "test", "of", "large", "number", "of", "strings" };

        // Note that append() return a builder itself, so this is a fluent API
        sb.append("<ul>").append("\n");
        for (String word : words) {
            sb.append(String.format(" <li>%s</li> \n", word));
        }
        sb.append("</ul>");

        // sb.toString() give us the final String object creation.
        String finalResult = sb.toString();
        System.out.println(finalResult);

        System.out.println("Using HTML Builder:");

        // We can create our own builders to create or own objects step-by-step.
        // Create an Html Builder
        HtmlBuilder builder = new HtmlBuilder("ul");
        for (String word : words) {
            builder.addChild("li", word);
        }

        // fluent interface
        builder.addChild("li", "more").addChild("li", "more");
        System.out.println(builder.toString());
    }
}
