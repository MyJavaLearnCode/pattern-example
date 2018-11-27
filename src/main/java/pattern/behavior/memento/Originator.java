package pattern.behavior.memento;

public class Originator {
    private String state;

    public Memento creatMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("state=" + this.state);
    }
}
