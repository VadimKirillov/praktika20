public class main {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5};
        Convers<Integer> listInt = new Convers(numbers);
        listInt.showList();
        String[] lines = {"S0", "S1", "S2", "S3", "S4", "S5"};
        Convers<String> listStr = new Convers(lines);
        listStr.showList();

    }
}