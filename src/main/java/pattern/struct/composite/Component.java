package pattern.struct.composite;

public abstract class Component {
    protected String name;
    abstract void add(Component c);

    abstract void remove(Component c);

    abstract void display(String depth);
}
