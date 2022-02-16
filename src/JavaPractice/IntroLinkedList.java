package JavaPractice;
import java.util.LinkedList;

public class IntroLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        ///데이터 저장
        list.add(111);
        list.add(222);
        list.add(333);

        ///데이터 참조
        System.out.println("1차참조");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //데이터 삭제
        list.remove(0);

        System.out.println("2차 참조");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
