package FinalExam;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileReader {
    private ArrayList<String> words;
    private String filename;

    TextFileReader(String filename){
        this.filename = filename;
        words = new ArrayList<>();
    }

    public String getFilename(){
        return this.filename;
    }

    public ArrayList<String> getWords(){
        return words;
    }

    public void readWords() throws IOException {
        Scanner in = new Scanner(new File("/Users/imjongho/Downloads/OOP-2021-2-final/IpsumTest.txt"));
        while(in.hasNext()){
            words.add(in.next());
        }
    }

    public void printWords(){
        System.out.println("words의 단어 개수:    " + words.size());
        for(int i=0;i<words.size();i++){
            System.out.println(words.get(i));
        }
    }


}

