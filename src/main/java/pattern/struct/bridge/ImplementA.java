package pattern.struct.bridge;

public class ImplementA extends Implementor {
    @Override
    public void operation() {
        System.out.println("A 的具体实现");
    }
}
