public class Main {
    public static void main(String[] args) {

        User user1 = new User("Марсель", "Сидиков", "12345", "Russia");
        User user2 = new User("Андей", "Ганиев", "123456", "Russia");

        User user3 = new User("Марсель", "Сидиков", "12345", "Turkey");

        Table<User, String> usersDescription = new HashTable<>();

        usersDescription.put(user1, "Преподаватель по Java");
        usersDescription.put(user2, "Студент, изучающий Java");
        usersDescription.put(user3, "Старший преподаватель по Java");

        System.out.println(user1.equals(user3));
        System.out.println(user1.hashCode());
        System.out.println(user3.hashCode());

        int x = 0;


    }
}
