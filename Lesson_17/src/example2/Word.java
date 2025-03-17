package example2;

public class Word {
    private String source;
    private String transcription;
    private String translation;

    Word(String source, String transcription, String translation) {
        this.source = source;
        this.transcription = transcription;
        this.translation = translation;
    }

    public String getSource() {
        return source;
    }

    public String getTranscription() {
        return transcription;
    }

    public String getTranslation() {
        return translation;
    }
}