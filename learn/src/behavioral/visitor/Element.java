package behavioral.visitor;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public interface Element {
   void accept(Visitor visitor);
}
