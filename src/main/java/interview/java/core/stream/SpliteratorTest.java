package interview.java.core.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpliteratorTest {

    public static void main(String[] args) {
        SpliteratorTest spliteratorTest = new SpliteratorTest();
        Spliterator<Article> spliterator = spliteratorTest.generateArticles().spliterator();
        //while (spliterator.tryAdvance(a -> a.name().concat("something")));

        Spliterator<Article> trySplit = spliterator.trySplit();

        List<Article> firstPart = new ArrayList<>();
        List<Article> secondPart = new ArrayList<>();

        spliterator.forEachRemaining(firstPart::add);
        trySplit.forEachRemaining(secondPart::add);

        System.out.println();
    }

    public List<Article> generateArticles() {
        return Stream.generate(() -> new Article("A java book"))
                .limit(15000)
                .collect(Collectors.toList());
    }
    record Article(String name) {

    }
}
