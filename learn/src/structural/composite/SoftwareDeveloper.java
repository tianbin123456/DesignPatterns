package structural.composite;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class SoftwareDeveloper implements Employee {
    private String employeeId;
    private String position;

    public SoftwareDeveloper(String employeeId, String position) {
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void reportToDailyWork() {
        System.out.println("Report to daily work by Employee Id"
                + employeeId + " position " + position);
    }
}
