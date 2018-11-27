package pattern.struct.facade;

/**
 * 外观模式(门面模式):为子系统的一组接口提供一个一致的界面;
 * 此模型定义了一个高层接口,这个接口是的子接口更加容易使用;
 * 将内部复杂的操作通过统一的接口对外;
 * io流处理
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.op1();
        facade.op2();

    }
}
