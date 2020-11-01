public class main2 {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5};
        Convers2<Integer> listInt = new Convers2<>(numbers);
        listInt.showList();
        System.out.println();

        String[] line = {"S0", "S1", "S2", "S3", "S4", "S5", "S6", "S7"};
        Convers2<String> listStr = new Convers2<>(line);

        listStr.showFive();


        System.out.println();
        String [] a={"ABC","DEF","PUTIN"};
        Integer [] b={-1,4,9};
        System.out.println(Solution.createArrayList(a));
        System.out.println(Solution.createHashList(b));
        System.out.println(Solution.createHashMap(a,b));
    }
}