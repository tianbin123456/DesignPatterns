package structural.adapter;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public class FishingBoatAdapter implements RowingBoat {
    /**
     * 对象适配
     */
    private final FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
