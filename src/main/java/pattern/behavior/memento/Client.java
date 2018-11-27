package pattern.behavior.memento;

/**
 * 备忘录:在不破话封装性的前提之下,捕获一个对象的内在状态,并在该对象之外保存这个状态.
 * 这样以后就可以将该对象恢复到原先保存的状态;
 * 发起人(originator):负责创建一个备忘录,用于记录当前时刻它的内部状态,并可以使用备忘录恢复内部状态;
 *                   根据需要决定备忘录需要存储那些状态;
 * 备忘录(memento):(对内部状态的统一抽象)负责存储originator的内部状态,并可以防止originator之外的其他对象访问备忘录;
 *                备忘录有两个接口,caretaker只能看到备忘录的窄接口,他只能将备忘录传递给其他对象.
 *                originator能看到宽接口,允许它访问返回到先前的状态所需要的全部数据;
 * 管理者(caretaker):(对备忘录存放位置的抽象)负责保存好备忘录,不能对备忘录的内容进行操作或检查;
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(o.creatMemento());

        o.setState("off");
        o.show();

        o.setMemento(careTaker.getMemento());
        o.show();
    }
}
