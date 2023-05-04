package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class Ceo implements Employee {

    private String employeeId;
    private String position;
    private List<Employee> employee = new ArrayList<Employee>();

    public Ceo(String employeeId, String position) {
        this.employeeId = employeeId;
        this.position = position;
    }

    public void addEmployee(Employee e) {
        employee.add(e);
    }

    public void removeEmployee(Employee e) {
        employee.remove(e);
    }

    @Override
    public void reportToDailyWork() {
        System.out.println("Report to daily work by Employee Id"
                + employeeId + " position " + position);
        for (Employee e : employee) {
            e.reportToDailyWork();
        }
    }
}
