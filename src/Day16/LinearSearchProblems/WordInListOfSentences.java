package Day16.LinearSearchProblems;

public class WordInListOfSentences {
    public static String findSentence(String[] sentences, String target){
        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            for(String word : words){
                if(word.equals(target))
                    return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "She sells seashells by the seashore.",
                "A journey of a thousand miles begins with a single step.",
                "To be or not to be, that is the question.",
                "All that glitters is not gold.",
                "The early bird catches the worm.",
                "Actions speak louder than words.",
                "Practice makes perfect.",
                "An apple a day keeps the doctor away.",
                "Better late than never."
        };
        String target = "seashells";
        System.out.println(findSentence(sentences, target));
    }
}
