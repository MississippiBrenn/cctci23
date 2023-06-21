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

    //diagonal difference given a 2d matrix return the difference of the two diagonals
    public static int diagonalDifference(List<List<Integer>> matrix){
        int leftDiagSum = 0;
        int rightDiagSum = 0;

        for(int i = 0; i < matrix.size(); i++){
            leftDiagSum += matrix.get(i).get(i);
            rightDiagSum += matrix.get(i).get(matrix.size()-1-i);
        }

        int diff = Math.abs(leftDiagSum - rightDiagSum);

        return diff;

    }

    public static boolean panagram(String s){
      char[] stringArray =   s.toCharArray();
      List stringList = Arrays.asList(stringArray);
      StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
      for(int i =0; i < alphabet.length(); i++){
          if(stringList.contains(alphabet.charAt(i))){
              alphabet.delete(i,i);
          }
      }
      return alphabet.isEmpty();
    }


}
