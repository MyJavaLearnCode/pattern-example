package pattern.creat.abstractfactory.factory;

import pattern.creat.abstractfactory.product.BImpl2;
import pattern.creat.abstractfactory.product.IProductA;
import pattern.creat.abstractfactory.product.AImpl2;
import pattern.creat.abstractfactory.product.IProductB;

public class Factory2 implements IFactory {
    @Override
    public IProductA creatA() {
        return new AImpl2();
    }

    @Override
    public IProductB creatB() {
        return new BImpl2();
    }
}
