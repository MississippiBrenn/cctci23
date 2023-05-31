import Chapter1.Chapter1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //TestData for HackerRank
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bba");
        strings.add("ab");

        List<String> queries = new ArrayList<>();
        queries.add("abc");
        queries.add("ab");
        queries.add("ab")

        //TestData for Chapter 1
        //For bulk scratch test data
        Chapter1 chapter1 = new Chapter1();
         System.out.println(chapter1.isUnique("cat"));
//        String[] onepointone = {"alias", "cat", "aaaA")};
//        for(String str: onepointone){
//           System.out.println(chapter1.isUnique(str));
//        }



    }
}