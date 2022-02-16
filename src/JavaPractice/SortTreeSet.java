package JavaPractice;
import java.util.TreeSet;
import java.util.Iterator;

public class SortTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        tSet.add(1);
        tSet.add(2);
        tSet.add(3);
        tSet.add(4);
        tSet.add(5);

        System.out.println("저장된 데이터 수 : " +tSet.size());

        Iterator<Integer> itr = tSet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
