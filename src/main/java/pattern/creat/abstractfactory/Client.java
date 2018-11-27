package pattern.creat.abstractfactory;

import pattern.creat.abstractfactory.factory.Factory1;
import pattern.creat.abstractfactory.factory.Factory2;
import pattern.creat.abstractfactory.factory.IFactory;
import pattern.creat.abstractfactory.product.IProductA;
import pattern.creat.abstractfactory.product.IProductB;

/**
 * 提供了一个创建一系列相关或者相互依赖对象的接口,无需指定他们具体的类;
 * 每个工厂都能生产一系列的产品,达到工厂之前的可替换;
 * 每个工厂生产的满足不同标准的产品;
 * 有业务模式相同的工厂,生产同质化的产品;例如开分厂;
 *
 * 举例:
 * 中兴和华为两家公司,都同时生产手机和基站;手机和基站分别有自己的标准(实现了接口)
 * 出于不同的原因,客户端需要用其中一家的产品来替代另一家公司的产品;
 *
 */
public class Client {
    public static void main(String[] args) {
        /*
        * 这里的工厂对象也可以看做是产品,可以通过简单工厂来实现;
        * */
        IFactory factory1 = new Factory1();
        IProductA productA = factory1.creatA();
        productA.doAOperate();
        IProductB productB = factory1.creatB();
        productB.doBOperat();

        IFactory factory2 = new Factory2();
        IProductA productA2 = factory2.creatA();
        productA2.doAOperate();
        IProductB productB2 = factory2.creatB();
        productB2.doBOperat();
    }
}
