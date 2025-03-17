package example2;

public class Dictionary {

    private Word[] words = new Word[10];

    private int size;

    public void addWord(String source, String transcription, String translation) {
        if (size == words.length) {
            System.err.println("example1.Dictionary overflow");
        }

        this.words[size] = new Word(source, transcription, translation);
        size++;
    }

    public Word[] getWords() {
        return words;
    }

    public int getSize() {
        return size;
    }
}
