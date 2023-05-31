import java.util.ArrayList;
import java.util.List;

public class HackerRanks {

    //compare two Lists of strings and return an array that has counts of the matching strings
    public static List<Integer> comparesqueriesandstrings(List<String> strings, List<String> queries){
        List<Integer> finalCount = new ArrayList<>();

        int count = 0;
        for(String string: strings){
            for(String query: queries){
                count+= string.equals(query)?1:0;
            }
            finalCount.add(count);
            count = 0;
        }
    return finalCount;
    }
}
