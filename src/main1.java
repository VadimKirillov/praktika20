public class main1 {
    public static void main(String[] args) {

        String[] line = {"S0", "S1", "S2", "S3", "S4", "S5"};
        Convers<String> listStr = new Convers(line);
        listStr.showList();
        System.out.println();

        Integer[] num = {0, 1, 2, 3, 4, 5};
        Convers1<Integer> listInt = new Convers1(num);

        listInt.add(300);
        listInt.showList();

        System.out.println();
        System.out.println(listInt.getByIndex(2));



    }
}