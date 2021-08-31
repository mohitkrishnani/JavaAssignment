import java.util.*;

class Q3{
    static List<String> trimList(List<String> list){
        for(int i =0; i<list.size(); i++){
            list.set(i,list.get(i).trim());
        }
        return list;
    }
    public static void main(String args[]){
        List<String> list = new ArrayList(Arrays.asList("Hello "," There"," Welcome "," to", " this world "));
        
        System.out.println("Before Trim :"+list);
        System.out.println("After Trim :"+trimList(list));
    }
}