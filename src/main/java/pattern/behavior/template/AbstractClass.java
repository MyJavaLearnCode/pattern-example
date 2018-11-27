package pattern.behavior.template;

public abstract class AbstractClass {
    public abstract void primitiveOp1();
    public abstract void primitiveOp2();
    public void templateMethod() {
        primitiveOp1();
        primitiveOp2();
    }
}
