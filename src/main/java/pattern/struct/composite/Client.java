package pattern.struct.composite;

/**
 * 将对象组合成树形结果以表示"部分-整体"的层次结构.
 * 组合模式使得用户对单个对象和组合对象的使用具有一直性;
 * 整体也可以看做部分场景;
 * 文件夹下包括文件和文件夹;
 * swing中JComponent
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf a"));
        root.add(new Leaf("leaf b"));

        Composite comp = new Composite("composite X");
        comp.add(new Leaf("leaf c"));
        comp.add(new Leaf("leaf d"));

        root.add(comp);

        root.display("");
    }
}
