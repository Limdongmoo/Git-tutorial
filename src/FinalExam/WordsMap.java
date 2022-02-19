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
                    hMap.put(list.get(i).charAt(list.get(i).length()-1),a+1);
                }
                else{
                    hMap.put(list.get(i).charAt(list.get(i).length()-1),1);
                }

            }
        }
    }

    public void printMap(){
        Set<Map.Entry<Character,Integer>> entrySet = hMap.entrySet();
        int total =0;
        for(Map.Entry<Character,Integer> e : entrySet){
            System.out.printf("%c:%d    ",e.getKey(),e.getValue());
            total+=e.getValue();
        }
        System.out.println("");
        System.out.println("Total number characters : " + total);
    }
}

