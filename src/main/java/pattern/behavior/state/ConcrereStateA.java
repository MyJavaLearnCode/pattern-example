package pattern.behavior.state;

public class ConcrereStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcrereStateB());
    }
}
