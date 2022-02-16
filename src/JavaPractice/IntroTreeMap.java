package JavaPractice;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.NavigableSet;

public class IntroTreeMap {
    public static void main(String[] args){
        TreeMap<Integer,String> tMap = new TreeMap<>();

        tMap.put(1,"data 1");
        tMap.put(3,"data 3");
        tMap.put(2,"data 2");
        tMap.put(5,"data 5");
        tMap.put(4,"data 4");

        NavigableSet<Integer> navi = tMap.navigableKeySet();

        System.out.println("오름차순 출력 ");
        Iterator<Integer> itr = navi.iterator();
        while(itr.hasNext()){
            System.out.println(tMap.get(itr.next()));
        }

        System.out.println("내림차순 출력");
        itr=navi.descendingIterator();
        while(itr.hasNext()){
            System.out.println(tMap.get(itr.next()));
        }


    }
}
