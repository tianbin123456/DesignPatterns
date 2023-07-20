package behavioral.template;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClassA = new ConcreteClassA();
        abstractClassA.templateMethod(-9);

        AbstractClass abstractClassB = new ConcreteClassB();
        abstractClassB.templateMethod(0);
    }
}
