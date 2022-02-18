package FinalExam;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileReaderSepDelimiter extends TextFileReader{
    public TextFileReaderSepDelimiter(String Filename){
        super(Filename);
    }

    @Override
    public void readWords() throws IOException {
        super.readWords();
        ArrayList<String> words = getWords();
        for(int i=0;i<words.size();i++) {
            StringTokenizer st = new StringTokenizer(words.get(i),",.",true);
            if(st.countTokens()==1){
                continue;
            }
            words.remove(i);
            while(st.hasMoreTokens()){
                words.add(st.nextToken());
            }
        }
    }
    public void printWords(){
        super.printWords();
    }
}

