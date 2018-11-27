package pattern.struct.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void add(Component c) {
        throw new UnsupportedOperationException("叶节点无法添加");
    }

    @Override
    void remove(Component c) {
        throw new UnsupportedOperationException("叶节点无法删除");
    }

    @Override
    void display(String depth) {
        System.out.println( depth + "--" + name);

    }
}
