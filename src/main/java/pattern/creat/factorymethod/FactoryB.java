package pattern.creat.factorymethod;

public class FactoryB implements IFactory {
    @Override
    public IProduct creat() {
        return new ProductB();
    }
}
