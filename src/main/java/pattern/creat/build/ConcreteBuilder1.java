package pattern.creat.build;

public class ConcreteBuilder1 implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildA() {
        product.add("部件A");
    }

    @Override
    public void buildB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
