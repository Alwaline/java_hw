public class Main4 {
    public static void main(String[] args) {
        Table<String, Integer> heights = new HashTable<>();

        heights.put("Марсель", 185);
        heights.put("Андрей", 182); // нет
        heights.put("Гузель", 170);
        heights.put("Саша", 180); // нет
        heights.put("Айнур", 184); // нет
        heights.put("Ильшат", 183);
        heights.put("Кирилл", 175);
        heights.put("Никита", 181);
        heights.put("Айнур", 190);

        System.out.println(heights.get("Марсель"));
        System.out.println(heights.get("Андрей"));
        System.out.println(heights.get("Гузель"));
        System.out.println(heights.get("Саша"));
        System.out.println(heights.get("Айнур"));
        System.out.println(heights.get("Ильшат"));
        System.out.println(heights.get("Кирилл"));
        System.out.println(heights.get("Никита"));

        int x = 0;
    }
}
