import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convers2<E> {

    private List<E> list = new ArrayList<>();

    public Convers2(E[] array) {
        list.addAll(Arrays.asList(array));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }

    public void showFive(){
        int i=0;
        for (Object ls : list){
            System.out.println(i + ": \t"  + ls);
            if (i==4)
                break;
            i++;
        }
    }

    public void add(E element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }
}