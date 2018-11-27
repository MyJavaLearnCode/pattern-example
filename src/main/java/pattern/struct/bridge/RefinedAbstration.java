package pattern.struct.bridge;

public class RefinedAbstration extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
