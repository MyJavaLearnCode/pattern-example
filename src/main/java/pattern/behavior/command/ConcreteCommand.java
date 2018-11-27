package pattern.behavior.command;

public class ConcreteCommand extends Command {
    public ConcreteCommand(Receicer receicer) {
        super(receicer);
    }

    @Override
    public void execute() {
        receicer.action();
    }
}
