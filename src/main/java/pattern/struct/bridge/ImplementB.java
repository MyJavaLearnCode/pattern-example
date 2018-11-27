package pattern.struct.bridge;

public class ImplementB extends Implementor {
    @Override
    public void operation() {
        System.out.println("B 的具体实现");
    }
}
