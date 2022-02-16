package MidtermExam;

public class Speech {
    private String[] words;

    public Speech(String[] speech){
        this.words=speech;
    }

    public Character getFirstCharOfWord(int idx){
        if(idx< words.length) {
            char firstChar = this.words[idx].charAt(0);
            return ConvertChar.toLowerCase(firstChar);
        }
        return null;
    }

    public int getNumOfWords(){
        return words.length;
    }

}

