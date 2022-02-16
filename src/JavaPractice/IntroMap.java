package JavaPractice;
import java.util.HashMap;

public class IntroMap {
    public static void main(String[] args){
        HashMap<Integer, String> hMap = new HashMap<>();

        hMap.put(1,"i am one");
        hMap.put(3,"i am three");
        hMap.put(7,"i am seven");

        System.out.println(hMap.get(3));
        System.out.println(hMap.get(7));

        hMap.remove(7);
        System.out.println(hMap.get(7));
    }
}
