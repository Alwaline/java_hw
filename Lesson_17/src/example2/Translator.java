package example2;

public class Translator {

    private Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String text) {
        String[] sourceWords = text.split(" "); // разбиваю исходный на английском по пробелам в массив

        String translatedText = ""; // здесь буду хранить переведенный текст

        for (String sourceWord : sourceWords) { // пробегаю исходный текст на английском языке
            boolean translated = false; // показывает нам, нашли ли мы перевод
            for (int i = 0; i < dictionary.getSize(); i++) { // пробегаю все слова из словаря
                Word word = dictionary.getWords()[i]; // берем текущее слово из словаря
                if (word.getSource().equals(sourceWord)) { // если я нашел английское слово в словаре
                    translatedText += word.getTranslation() + " "; // добавляю русский перевод к результату
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