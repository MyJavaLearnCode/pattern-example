package pattern.behavior.template;

/**
 * 模板方法模式:定义了一个操作中的算法的骨架,而将一些步骤延迟到子类中;
 * 模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定的步骤;
 * 最基本的继承关系的使用;
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass;
        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
