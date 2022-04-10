package be.avidoo.patterns.designpatterns.structural.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Movie topGun = new Movie("Top Gun", "1986");

        // Concrete Formatters
        Formatter printFormatter = new StringFormatter();
        Formatter htmlFormatter = new HtmlFormatter();

        MoviePrinter moviePrinter = new MoviePrinter(topGun);

        String stringResult = moviePrinter.print(printFormatter);
        String htmlResult = moviePrinter.print(htmlFormatter);

        System.out.println(stringResult);
        System.out.println(htmlResult);
    }
}
