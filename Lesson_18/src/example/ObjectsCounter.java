package example;

// final class - нельзя наследовать
public final class ObjectsCounter {

    // глобальное поле, которое хранит единственный экземпляр класса
    private final static ObjectsCounter instance;

    // при загрузке класса (при старте приложения)
    static {
        // создаем объект этого класса
        instance = new ObjectsCounter();
    }

    // пустой приватный конструктор запрещает создавать новые объекты
    private ObjectsCounter() {

    }

    // метод для получения объекта класса
    public static ObjectsCounter getInstance() {
        return instance;
    }

    // счетчик объектов
    private int objectsCount;
    // метод для увеличения счетчика

    public void newObject() {
        objectsCount++;
    }

    public void printCount() {
        System.out.println(objectsCount);
    }
}
