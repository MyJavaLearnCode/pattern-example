package pattern.behavior.command;

public abstract class Command {
    protected Receicer receicer;

    public abstract void execute();

    public Command(Receicer receicer) {
        this.receicer = receicer;
    }
}
