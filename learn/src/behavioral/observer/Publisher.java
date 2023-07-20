package behavioral.observer;

/**
 * @author tianbin
 * @date 2023/6/28
 * @Description
 * @since v1.0.0
 */
public interface Publisher {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notify(double amt);
}
