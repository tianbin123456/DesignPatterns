package creational.abstract_factory;

/**
 * @author tianbin
 * @date 2023/4/7
 * @Description
 * @since v1.0.0
 */
public class Car implements Vehicle{
    @Override
    public void make() {
        System.out.println("car ");
    }
}
