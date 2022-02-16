package MidtermExam;

public class Speech {
    String[] words;

    public Speech(String[] speech){
        this.words=speech;
    }

    public char getFirstCharOfWord(int idx){
        char firstChar = this.words[idx].charAt(0);
        return ConvertChar.toLowerCase(firstChar);
    }

    public int getNumOfWords(){
        return words.length;
    }

}
