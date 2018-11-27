package pattern.creat.build;

/**
 * 将一个复杂对象的创建过程与它的表示分离,是的同样的构建过程可以创建不同的表示;
 * IBuilder指定了创建各个部件的表示;
 * Director封装了各个部件的组装过程;这部分通常是具体的构建细节,客户端不需要知道;
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        IBuilder builder1 = new ConcreteBuilder1();
        IBuilder builder2 = new ConcreteBuilder2();
        director.construct(builder1);
        Product p1 = builder1.getResult();
        p1.show();

        director.construct(builder2);
        Product p2 = builder2.getResult();
        p2.show();

    }
}
