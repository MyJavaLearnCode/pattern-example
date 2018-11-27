package pattern.behavior.mediator;

public class ConcreteMediator extends Mediator {
    private ConcreteColleagueA concreteColleagueA;

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    private ConcreteColleagueB concreteColleagueB;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == concreteColleagueA) {
            concreteColleagueB.notice(msg);
        } else {
            concreteColleagueA.notice(msg);
        }
    }
}
