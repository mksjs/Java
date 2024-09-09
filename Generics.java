import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(1.734);
        list.add("JAVA");

        Integer num = (Integer) list.get(0);
        Double num1 = (Double) list.get(1);
	Integer num2 = (Integer) list.get(2);

    }
}
