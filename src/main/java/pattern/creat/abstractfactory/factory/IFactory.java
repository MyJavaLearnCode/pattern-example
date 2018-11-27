package pattern.creat.abstractfactory.factory;

import pattern.creat.abstractfactory.product.IProductA;
import pattern.creat.abstractfactory.product.IProductB;

public interface IFactory {
    IProductA creatA();

    IProductB creatB();
}
