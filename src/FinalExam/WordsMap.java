package FinalExam;
import java.util.ArrayList;
import java.util.Properties;


public class WordsMap {
    static final int WORD_BEGINNING = -1;
    static final int WORD_END = -2;

    public void createWordsMapFromList(ArrayList<String> list,int idx){
        char[] arr = new char[list.size()];
        if(idx==WORD_BEGINNING){
            for(int i=0;i<list.size();i++) {
                arr[i] = list.get(i).charAt(0);
            }
        }
        else{
            for(int i=0;i<list.size();i++){
                arr[i]=list.get(i).charAt(list.get(i).lastIndexOf(list.get(i)));
            }
        }
    }
}
