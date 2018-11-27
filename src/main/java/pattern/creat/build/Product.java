package pattern.creat.build;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品:" + parts);
    }
}
