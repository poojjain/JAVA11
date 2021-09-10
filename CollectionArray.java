import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i< 100; i++) {
            list.add("demo"+i);
        }
        //String arr[] = list.toArray(String[]::new); java 11 feature
        //System.out.println(Arrays.toString(arr));
    }

}
