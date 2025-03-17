package example2;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("text", "text", "text");

        Dictionary itDictionary = new Dictionary();

        itDictionary.addWord("Algorithm", "[ˈælɡəˌrɪðəm]", "Алгоритм");
        itDictionary.addWord("Backend", "[ˈbækˌɛnd]", "Бэкенд (серверная часть)");
        itDictionary.addWord("Cloud computing", "[klaʊd kəmˈpjuːtɪŋ]", "Облачные вычисления");
        itDictionary.addWord("Database", "[ˈdeɪtəˌbeɪs]", "База данных");
        itDictionary.addWord("Encryption", "[ɪnˈkrɪpʃən]", "Шифрование");
        itDictionary.addWord("Frontend", "[ˈfrʌntˌɛnd]", "Фронтенд (пользовательский интерфейс)");

        itDictionary.getWords()[1] = null;

        Translator itTranslator = new Translator(itDictionary);

        String result = itTranslator.translate("In modern Cloud computing, both Frontend and Backend development are essential for creating scalable applications. The Frontend ensures a user-friendly interface, while the Backend processes requests and interacts with the Database to store and retrieve data efficiently. To protect sensitive information, Encryption is implemented, securing data transmission and preventing unauthorized access.");

        System.out.println(result);

        Dictionary medDictionary = new Dictionary();

        medDictionary.addWord("Diagnosis", "[ˌdaɪəɡˈnoʊsɪs]", "Диагноз");
        medDictionary.addWord("Therapy", "[ˈθɛrəpi]", "Терапия");
        medDictionary.addWord("Symptom", "[ˈsɪmptəm]", "Симптом");
        medDictionary.addWord("Prescription", "[prɪˈskrɪpʃən]", "Рецепт (на лекарство)");
        medDictionary.addWord("Inflammation", "[ˌɪnfləˈmeɪʃən]", "Воспаление");
        medDictionary.addWord("Immune system", "[ɪˈmjuːn ˈsɪstəm]", "Иммунная система");

        Translator medTranslator = new Translator(medDictionary);

        String result2 = medTranslator.translate("A proper Diagnosis is crucial for determining the right Therapy. The presence of certain Symptoms helps doctors identify the disease and provide an appropriate Prescription. In many cases, Inflammation is a sign of infection, which triggers a response from the Immune system to protect the body.");

        System.out.println(result2);
    }
}
