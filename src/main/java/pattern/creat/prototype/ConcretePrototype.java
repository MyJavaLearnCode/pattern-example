package pattern.creat.prototype;

public class ConcretePrototype extends Prototype {

    public ConcretePrototype(String detail) {
        this.detail = detail;
    }

    @Override
    public Prototype copy() {
        return new ConcretePrototype(this.detail);
    }
}
