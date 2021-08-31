import java.util.*;
import static java.lang.System.out;
class Q1{

    public static void main(String args[]){
        ArrayList<String> list = new ArrayList(Arrays.asList(args));
        Collections.shuffle(list);

        out.println("USING STREAMS");
        list.stream().forEach(element -> out.print(element+' '));
        out.println();
        
        out.println("USING TRADITIONAL ENHANCED FOR LOOP");
        for(String s: list){
            out.print(s+' ');
        }
    }
}