package pattern.creat.factorymethod;

public class FactoryA implements IFactory {
    @Override
    public IProduct creat() {
        return new ProductA();
    }
}
