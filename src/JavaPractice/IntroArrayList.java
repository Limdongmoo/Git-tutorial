package JavaPractice;
import java.util.ArrayList;

public class IntroArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(111);
        list.add(222);
        list.add(333);
        // 데이터의 저장

        // 데이터 출력

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //데이터의 삭제

        list.remove(0);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
