package Day23.Annotations.BasicProblems;

import java.util.ArrayList;
public class SuppressUncheckedWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("sdf");
        list.add(3.4);
        System.out.println(list);
    }
}
