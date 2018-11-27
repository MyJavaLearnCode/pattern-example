package pattern.behavior.mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg) {
        mediator.send(msg,this);
    }

    public void notice(String msg) {
        System.out.println("B 得到了通知:" + msg);

    }
}
