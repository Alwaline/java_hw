public class Main2 {
    public static void main(String[] args) {
        SimpleTable<String, Integer> heights = new SimpleTable<>();

        heights.put("Марсель", 185);
        heights.put("Андрей", 182);
        heights.put("Гузель", 170);
        heights.put("Саша", 180);
        heights.put("Гузель", 171);

        System.out.println(heights.get("Гузель"));
    }
}
