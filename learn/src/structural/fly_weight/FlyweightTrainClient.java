package structural.fly_weight;

import java.time.YearMonth;

/**
 * @author tianbin
 * @date 2023/4/23
 * @Description
 * @since v1.0.0
 */
public class FlyweightTrainClient {
    private static final String trainNo[] = {"Ek102", "HM399", "DF304", "SL234", "BM987"};

    public static void main(String[] args) {
        YearMonth yearMonthObject = YearMonth.of(2021, 11);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        // Travel entire month
        for (int i = 0; i < daysInMonth; i++) {
            String trainNo = getRandomTrain();
            // Pick randomly selected train to travel
            Train train = TravelTravelFactory.getTrain(trainNo);
            train.setDriverName("TrainDriverFor" + trainNo);
            train.travel();
        }

    }

    // Get random train
    private static String getRandomTrain() {
        return trainNo[(int) (Math.random() * trainNo.length)];
    }
}
