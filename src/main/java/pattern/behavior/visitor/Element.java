package pattern.behavior.visitor;

public abstract class Element {
    public abstract void accept(Visitor visitor);
}
