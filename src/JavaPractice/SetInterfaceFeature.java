package JavaPractice;
import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceFeature {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("First");

        System.out.println("저장된 데이터 수");
        System.out.println(set.size());

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
