package pattern.creat.build;

public class ConcreteBuilder2 implements IBuilder {
    private Product product = new Product();
    @Override
    public void buildA() {
        product.add("部件X");

    }

    @Override
    public void buildB() {
        product.add("部件Y");

    }

    @Override
    public Product getResult() {
        return product;
    }
}
