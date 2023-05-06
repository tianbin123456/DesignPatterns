package structural.adapter;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public class Client {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
        Captain captain2 = new Captain(new FishingBoatAdapter2());
        captain2.row();
    }
}
