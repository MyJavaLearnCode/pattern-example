package pattern.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    public Composite(String name) {
        this.name = name;
    }

    private List<Component> components = new ArrayList<>();

    @Override
    void add(Component c) {
        components.add(c);
    }

    @Override
    void remove(Component c) {
        components.remove(c);
    }

    @Override
    void display(String depth) {
        depth = depth + "--";
        System.out.println(depth + name);
        for (Component component : components) {
            component.display(depth);
        }


    }
}
