package Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        // Adding array items to list:
        for(String x: things) { // Ussing an enhanced for-each loop.
            list1.add(x);
        }

        String[] morethings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        for(String y: morethings) {
            list2.add(y);
        }

        for(int i = 0; i < list2.size(); i++){
            System.out.printf("%s", list2.get(i));
        }
    }

}
