package pattern.creat.abstractfactory.factory;

import pattern.creat.abstractfactory.product.BImpl1;
import pattern.creat.abstractfactory.product.IProductA;
import pattern.creat.abstractfactory.product.AImpl1;
import pattern.creat.abstractfactory.product.IProductB;

public class Factory1 implements IFactory {
    @Override
    public IProductA creatA() {
        return new AImpl1();
    }

    @Override
    public IProductB creatB() {
        return new BImpl1();
    }
}
