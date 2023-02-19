import java.util.ArrayList;
import java.util.Objects;

public class MainC {
    public static void main(String[] args) {

        Article art1 = new Article("Nicklas Knudsen", "How to make C");
        Article art2 = new Article("Nicklas Knudsen", "How to make money");
        Article art3 = new Article("Nicklas Knudsen", "How to make a lot of money");
        Article art4 = new Article("Nicklas Knudsen", "How to code");
        Article art5 = new Article("Nicklas Knudsen", "How to code in Java");

        ArrayList<Article> articles = new ArrayList<Article>();
        articles.add(art1);
        articles.add(art2);
        articles.add(art3);
        articles.add(art4);
        articles.add(art5);
        System.out.println(articles);
    }
}
