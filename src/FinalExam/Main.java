package FinalExam;

import java.io.IOException;

public class Main {
    public void createMapAndPrint(TextFileReader reader, int idx) {
        reader.printWords();
        System.out.println("");
        WordsMap map = new WordsMap();
        map.createWordsMapFromList(reader.getWords(), idx);
        map.printMap();
    }

    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "IpsumTest.txt";
        Main m = new Main();
        TextFileReader reader1 = new TextFileReader(FILE_NAME);
        reader1.readWords();
        TextFileReader reader2 = new TextFileReaderSepDelimiter(FILE_NAME);
        reader2.readWords();

        System.out.println("********* No delimiter, first letter *********");
        m.createMapAndPrint(reader1, WordsMap.WORD_BEGINNING);
        System.out.println("");
        System.out.println("********* Separated delimiters, first letter *********");
        m.createMapAndPrint(reader2, WordsMap.WORD_BEGINNING);
        System.out.println("");
        System.out.println("********* No delimiter, last letter *********");
        m.createMapAndPrint(reader1, WordsMap.WORD_END);
        System.out.println("");
        System.out.println("********* Separated delimiters, last letter *********");
        m.createMapAndPrint(reader2, WordsMap.WORD_END);
    }
    /*
    ********* No delimiter, first letter *********
    words의 단어 개수:    15
            "Lorem"  "Ipsum"  "is"  "simply"  "dummy"  "text"  "of"  "the"  "printing."  "therefore"  "always"  "free"  "from"  "repetition,"  "injected"

    p:1  a:1  r:1  s:1  d:1  t:3  f:2  I:1  i:2  L:1  o:1
    Total number characters : 15

            ********* Separated delimiters, first letter *********
    words의 단어 개수:    17
            "Lorem"  "Ipsum"  "is"  "simply"  "dummy"  "text"  "of"  "the"  "therefore"  "always"  "free"  "from"  "injected"  "printing"  "."  "repetition"  ","

    a:1  d:1  f:2  I:1  i:2  L:1  ,:1  .:1  o:1  p:1  r:1  s:1  t:3
    Total number characters : 17

            ********* No delimiter, last letter *********
    words의 단어 개수:    15
            "Lorem"  "Ipsum"  "is"  "simply"  "dummy"  "text"  "of"  "the"  "printing."  "therefore"  "always"  "free"  "from"  "repetition,"  "injected"

    s:2  t:1  d:1  e:3  f:1  y:2  ,:1  m:3  .:1
    Total number characters : 15

            ********* Separated delimiters, last letter *********
    words의 단어 개수:    17
            "Lorem"  "Ipsum"  "is"  "simply"  "dummy"  "text"  "of"  "the"  "therefore"  "always"  "free"  "from"  "injected"  "printing"  "."  "repetition"  ","

    s:2  t:1  d:1  e:3  f:1  g:1  y:2  ,:1  m:3  .:1  n:1
    Total number characters : 17
   */
}

