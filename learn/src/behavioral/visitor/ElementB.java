package behavioral.visitor;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class ElementB implements Element {
    private double stateForB = 0;

    @Override
    public void accept(Visitor v) {
        System.out.println("=== 开始访问元素 B......");
        v.visitB(this);
    }

    public double getBState() {
        return stateForB;
    }

    public void setBState(double value) {
        stateForB = value;
    }
}
