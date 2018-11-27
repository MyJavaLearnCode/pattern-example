package pattern.behavior.command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void exeCmd() {
        command.execute();
    }
}
