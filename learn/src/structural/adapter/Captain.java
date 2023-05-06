package structural.adapter;

/**
 * @author tianbin
 * @date 2023/5/6
 * @Description
 * @since v1.0.0
 */
public class Captain {
    private final RowingBoat rowingBoat;
    // default constructor and setter for rowingBoat
    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}

