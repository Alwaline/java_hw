package example1;

public class Dictionary {

    private Word[] words = new Word[10];

    private int size;

    private static class Word {
        String source;
        String transcription;
        String translation;

        Word(String source, String transcription, String translation) {
            this.source = source;
            this.transcription = transcription;
            this.translation = translation;
        }
    }

    public void addWord(String source, String transcription, String translation) {
        if (size == words.length) {
            System.err.println("example1.Dictionary overflow");
        }

        this.words[size] = new Word(source, transcription, translation);
        size++;
    }

    public class Translator {
        public String translate(String text) {
            String[] sourceWords = text.split(" "); // разбиваю исходный на английском по пробелам в массив

            String translatedText = ""; // здесь буду хранить переведенный текст

            for (String sourceWord : sourceWords) { // пробегаю исходный текст на английском языке
                boolean translated = false; // показывает нам, нашли ли мы перевод
                for (int i = 0; i < size; i++) { // пробегаю все слова из словаря
                    Word word = words[i]; // берем текущее слово из словаря
                    if (word.source.equals(sourceWord)) { // если я нашел английское слово в словаре
                        translatedText += word.translation + " "; // добавляю русский перевод к результату
                        translated = true; // говорим, что нашли перевод
                        break; // останавливаю цикл
                    }
                }
                if (!translated) {
                    translatedText += sourceWord + " "; // добавим исходное слово (оставляем без перевода)
                }
            }

            return translatedText;
        }
    }
}
