package FinalExam;
import java.util.*;


public class WordsMap {
    static final int WORD_BEGINNING = -1;
    static final int WORD_END = -2;
    private HashMap<Character,Integer> hMap;

    public void createWordsMapFromList(ArrayList<String> list,int idx){
        hMap = new HashMap<>();

        if(idx==WORD_BEGINNING){
            for(int i=0;i<list.size();i++){
                if(hMap.containsKey(list.get(i).charAt(0))){
                    int a=hMap.get(list.get(i).charAt(0));
                    hMap.remove(list.get(i).charAt(0));
                    hMap.put(list.get(i).charAt(0),a+1);
                }
                else{
                    hMap.put(list.get(i).charAt(0),1);
                }

            }
        }
        else{
            for(int i=0;i<list.size();i++){
                if(hMap.containsKey(list.get(i).charAt(list.get(i).length()-1))){
                    int a=hMap.get(list.get(i).charAt(list.get(i).length()-1));
                    hMap.remove(list.get(i).charAt(list.get(i).length()-1));
                    hMap.put(list.get(i).charAt(list.get(i).length()-1),a+1);
                }
                else{
                    hMap.put(list.get(i).charAt(list.get(i).length()-1),1);
                }

            }
        }
    }

    public void printMap(){
        Iterator<Character> itr = hMap.keySet().iterator();
        int total =0;
        while(itr.hasNext()) {
                char a = itr.next();
                System.out.printf("%c:%d  ", a, hMap.get(a));
                total+=hMap.get(a);
        }
        System.out.println("");
        System.out.println("Total number characters : " + total);
    }
}

