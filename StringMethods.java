import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMethods {

    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();
        stringMethods.repeatMethod();
        stringMethods.stripMethod();
        stringMethods.isBlankMethod();
        stringMethods.lines();
    }

    private void repeatMethod() {
        String root = "Hello";
        //String repeated = root.repeat(4);
        //String noRep = root.repeat(0);
        System.out.println(root);
        //System.out.println(repeated);
        //System.out.println(noRep);
    }

    private void stripMethod() {
        String testStr = "hello\u2001";
        //String outStr = testStr.strip(); //while trim cannot remove this unicode space character as it is greater than \u0020
        //System.out.println(outStr);
    }

    private void isBlankMethod() {
        String blankString = "\u2005";
        //boolean isBlank = blankString.isBlank();
        //System.out.println(isBlank);
    }

    private void lines() {
        String multilineString = "This is an example \n for multiline String\r for testing";
        //Stream<String> lines =  multilineString.lines();
        //for(String str : lines.collect(Collectors.toList())) {
         //   System.out.println(str);
       // }
    }

}
