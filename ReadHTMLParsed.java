import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;

public class ReadHTMLParsed {
    public static void main(String[] args) {
        try {
            File input = new File("data/page.html");
            Document doc = Jsoup.parse(input, "UTF-8");

            // Print the title or tags
            Element h1 = doc.select("h1").first();
            Element p = doc.select("p").first();

            System.out.println("H1 content: " + h1.text());
            System.out.println("Paragraph: " + p.text());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
