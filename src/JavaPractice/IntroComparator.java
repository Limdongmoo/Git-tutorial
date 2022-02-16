package JavaPractice;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class StrLenComparator implements Comparator<String>{
    public int compare(String str1, String str2){
        return (str1.length()-str2.length());
    }
}

public class IntroComparator {
    public static void main(String[] args){
        TreeSet<String> tSet = new TreeSet<String>(new StrLenComparator());

        tSet.add("Dog");
        tSet.add("Individual");
        tSet.add("Apple");

        Iterator itr = tSet.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
