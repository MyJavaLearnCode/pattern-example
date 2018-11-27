package pattern.creat.prototype;

/**
 * 从一个对象创建出另一个可定制的对象,不需要知道任何创建的细节;
 * 通常用于复制对象过程中有少量修改的操作;
 * java中标准方式实现了cloneable接口就属于该模式;
 */
public class Client {
    public static void main(String[] args) {
        Prototype p = new ConcretePrototype("2012");
        Prototype pCopy = p.copy();
        pCopy.setDetail("2014");
        System.out.println(p.getDetail());
        System.out.println(pCopy.getDetail());
    }
}
