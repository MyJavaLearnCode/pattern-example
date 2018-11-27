package pattern.struct.decorate;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("最基本的操作");
    }
}
