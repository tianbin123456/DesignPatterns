package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        List<Element> elementList = new ArrayList<>();
        ElementA elementA = new ElementA();
        elementA.setAState(11);
        ElementB elementB = new ElementB();
        elementB.setBState(12);
        elementList.add(elementA);
        elementList.add(elementB);
        for (Element element :elementList) {
            element.accept(new VisitorBehavior());
        }
    }
}
