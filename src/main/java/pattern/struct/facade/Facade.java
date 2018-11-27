package pattern.struct.facade;

public class Facade {
    private SubsystemA subsystemA = new SubsystemA();
    private SubsystemB subsystemB = new SubsystemB();
    private SubsystemC subsystemC = new SubsystemC();
    private SubsystemD subsystemD = new SubsystemD();

    public void op1() {
        System.out.println("facade1操作");
        subsystemA.operatA();
        subsystemB.operatB();
    }

    public void op2() {
        System.out.println("facade2操作");
        subsystemC.operatC();
        subsystemD.operatD();
    }
}
