package pattern.behavior.state;

public class ConcrereStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcrereStateA());
    }
}
