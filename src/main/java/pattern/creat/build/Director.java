package pattern.creat.build;

public class Director {
    public void construct(IBuilder builder) {
        builder.buildA();
        builder.buildB();
    }
}
