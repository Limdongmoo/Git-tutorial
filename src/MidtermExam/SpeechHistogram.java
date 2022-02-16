package MidtermExam;

public class SpeechHistogram {
    private int[] counts;
    private int[] groupCounts;
    private Speech sp;

    public SpeechHistogram(Speech sp){
        this.sp = sp;
        counts=new int[26];
        groupCounts=new int[5];
    }

    public void calculateHistogram(){
        for(int i=0;i<sp.getNumOfWords();i++){
            for(int j=0;j<26;j++){
                if(sp.getFirstCharOfWord(i)=='a'+j){
                    counts[j]+=1;
                }
            }
        }
        for(int i=0;i<5;i++){
            groupCounts[0]+=counts[i];
        }
        for(int i=5;i<10;i++){
            groupCounts[1]+=counts[i];
        }
        for(int i=10;i<15;i++){
            groupCounts[2]+=counts[i];
        }
        for(int i=15;i<20;i++){
            groupCounts[3]+=counts[i];
        }for(int i=20;i<25;i++){
            groupCounts[4]+=counts[i];
        }
    }

    public void print(){
        for(int i=0;i<counts.length;i++){
            System.out.printf("%c : (%d)\n",97+i,counts[i]);
        }

        for(int i=0;i<groupCounts.length;i++){
            System.out.printf("%c - %c : (%d)" , 97+5*i,101+5*i,groupCounts[i]);
            for(int j=0;j<groupCounts[i];j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

