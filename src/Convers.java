import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convers<T> {

    private List<T> list = new ArrayList<>();

    public Convers(T[] arr) {
        list.addAll(Arrays.asList(arr));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }
    public void add(T element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }



}

