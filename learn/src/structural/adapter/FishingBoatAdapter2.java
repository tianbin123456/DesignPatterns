package structural.adapter;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public class FishingBoatAdapter2 extends FishingBoat implements RowingBoat {

    public FishingBoatAdapter2() {
    }

    /**
     * 类适配
     */
    @Override
    public void row() {
        super.sail();
    }
}
