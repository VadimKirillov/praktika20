import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convers1<T> {
    private List<T> list = new ArrayList<>();
    public Convers1(T[] arr) {
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

    public T getByIndex(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        return "Convers1{" +
                "list=" + list +
                '}';
    }
}