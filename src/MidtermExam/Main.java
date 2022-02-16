package MidtermExam;

public class Main {
    public static void main(String[] args) {
        // Partial excerpts from American Actor Robert Deniro's speech to NYU's TISCH School of the Arts, 2015
        String[] RobertDeniroSpeech = { "The", "good", "news", "is", "that",
                "that’s", "not", "a", "bad", "place", "to", "start.",
                "Now", "that", "you’ve", "made", "your", "choice,",
                "or", "rather", "succumbed", "to", "it,", "your",
                "path", "is", "clear.", "Not", "easy", "but", "clear.",
                "You", "have", "to", "keep", "working,", "it’s",
                "that", "simple.", "You", "got", "through", "TISCH,",
                "that’s", "a", "big", "deal,", "or", "to", "put", "it",
                "another", "way,", "you", "got", "through", "TISCH,",
                "big", "deal.", "Well", "it’s", "a", "start.",
                "On", "this", "day", "of", "triumphantly", "graduating",
                "a", "new", "door", "is", "opening", "for", "you.",
                "A", "door", "to", "a", "lifetime", "of", "rejection.",
                "It’s", "inevitable.", "It’s", "what", "graduates",
                "call", "the", "the", "real", "world.", "You’ll",
                "experience", "it", "auditioning", "for", "a",
                "part", "or", "a", "place", "in", "a", "company.",
                "It’ll", "happen", "to", "you", "when", "you’re",
                "looking", "for", "backers", "for", "a", "project.",
                "You’ll", "feel", "it", "when", "door", "close",
                "on", "you", "when", "you’re", "trying", "to",
                "get", "attention", "for", "something", "you", "have",
                "written,", "and", "when", "you’re", "looking",
                "for", "a", "directing", "or", "choreographing",
                "job." };

        Speech speech = new Speech(RobertDeniroSpeech);
        SpeechHistogram histogram = new SpeechHistogram(speech);
        histogram.calculateHistogram();
        histogram.print();
        /*
a : (15)
b : (5)
c : (7)
d : (7)
e : (2)
f : (7)
g : (6)
h : (3)
i : (14)
j : (1)
k : (1)
l : (3)
m : (1)
n : (5)
o : (9)
p : (6)
q : (0)
r : (3)
s : (5)
t : (22)
u : (0)
v : (0)
w : (10)
x : (0)
y : (15)
z : (0)
a - e : (36)************************************
f - j : (31)*******************************
k - o : (19)*******************
p - t : (36)************************************
u - y : (25)*************************


    */
    }
}

