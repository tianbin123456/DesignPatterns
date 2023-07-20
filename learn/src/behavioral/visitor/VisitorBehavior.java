package behavioral.visitor;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class VisitorBehavior implements Visitor {
    @Override
    public void visitA(ElementA elementA) {
        int x = elementA.getAState();
        x++;
        System.out.println("=== 当前A的state为：" + x);
        elementA.setAState(x);
    }

    @Override
    public void visitB(ElementB elementB) {
        double x = elementB.getBState();
        x++;
        System.out.println("=== 当前B的state为：" + x);
        elementB.setBState(x);
    }
}
