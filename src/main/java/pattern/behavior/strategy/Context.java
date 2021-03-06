package pattern.behavior.strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface() {
        strategy.algorithm();
    }
}
