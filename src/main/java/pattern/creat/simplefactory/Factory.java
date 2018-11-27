package pattern.creat.simplefactory;


public class Factory {
    public static IOperation getOperation(String operate) {
        /*
        * 可以通过动态加载-反射机制消除代码的判断逻辑
        * */
        if (operate == null) {
            return new OperationImplA();
        } else {
            return new OperationImplB();
        }
    }
}
