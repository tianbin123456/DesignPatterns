package structural.fly_weight;

import java.util.HashMap;

/**
 * @author tianbin
 * @date 2023/4/23
 * @Description
 * @since v1.0.0
 */
public class TravelTravelFactory {
    private static final HashMap<String, Train> trainMap = new HashMap<String, Train>();

    public static Train getTrain(String trainNo) {
        Train train = trainMap.get(trainNo);
        if (train == null) {
            train = new Train(trainNo);
            train.setNoOfStops(20);
            train.setPassengeCount(1000);
            trainMap.put(trainNo, train);
            System.out.println(train + "");
        }
        return train;
    }
}
