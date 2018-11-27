package pattern.behavior.mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg) {
        mediator.send(msg,this);
    }

    public void notice(String msg) {
        System.out.println("A 得到了通知:" + msg);

    }


}
