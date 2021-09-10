import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicate {

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "\n\n", "Not Predicate", " ", "Example");
        List<String> withoutBlanks = null;//sampleList.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        System.out.println(withoutBlanks.toString());
    }

}
