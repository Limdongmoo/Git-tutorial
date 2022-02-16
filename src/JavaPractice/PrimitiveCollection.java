package JavaPractice;
import java.util.LinkedList;
import java.util.Iterator;

public class PrimitiveCollection {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        System.out.println(list);

    }
}
