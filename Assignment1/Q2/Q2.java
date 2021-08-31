import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<String>( new Comparator<String>(){
            public int compare(String str1, String str2){
                return str1.compareToIgnoreCase(str2);
            }
        });
        for (String a : args)
               s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}