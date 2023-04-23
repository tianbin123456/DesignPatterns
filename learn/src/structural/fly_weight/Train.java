package structural.fly_weight;

/**
 * @author tianbin
 * @date 2023/4/23
 * @Description
 * @since v1.0.0
 */
public class Train implements TrainTransport {

    private String trainNo;

    private String driverName;

    private int passengeCount;

    private int noOfStops;

    public Train(String trainNo) {
        this.trainNo = trainNo;
    }

    @Override
    public void travel() {
        System.out.println("Train Driver " + driverName +
                " is start the Train No " + trainNo + " to travel");
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getPassengeCount() {
        return passengeCount;
    }

    public void setPassengeCount(int passengeCount) {
        this.passengeCount = passengeCount;
    }

    public int getNoOfStops() {
        return noOfStops;
    }

    public void setNoOfStops(int noOfStops) {
        this.noOfStops = noOfStops;
    }

    @Override
    public String toString() {
        return "Train No " + trainNo + " is arrange and ready to travel";
    }
}
