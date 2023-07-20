package behavioral.template;

/**
 * @author tianbin
 * @date 2023/6/25
 * @Description
 * @since v1.0.0
 */
public class AbstractClass {
    public void templateMethod(int key) {
        if (key >= 0) {
            step1();
        } else {
            step2();
        }

    }

    void step1() {
    }

    void step2() {
    }
}
