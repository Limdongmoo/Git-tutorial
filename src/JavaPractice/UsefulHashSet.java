package JavaPractice;
import java.util.HashSet;
import java.util.Iterator;

public class UsefulHashSet {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");

        Iterator<String> itr = set.iterator();
        //1차 출력 및 Third 삭제
        System.out.println("1차 출력");
        while(itr.hasNext()){
            String curStr = itr.next();
            System.out.println(curStr);
            if(curStr.equals("Third")){
                itr.remove();
            }
        }

        System.out.println("2차 출력");
        for(String e : set){
            System.out.println(e);
        }
    }
}
