package structural.composite;

/**
 * @author tianbin
 * @date 2023/5/4
 * @Description
 * @since v1.0.0
 */
public class CompositeClient {
    public static void main(String[] args) {
        Ceo ceo= new Ceo("1001", "CEO");
        SoftwareArchitect architect1= new SoftwareArchitect("2001", "Software Architect");
        SoftwareArchitect architect2= new SoftwareArchitect("2002", "Software Architect");
        SoftwareDeveloper developer1= new SoftwareDeveloper("3001", "Software Developer");
        SoftwareDeveloper developer2= new SoftwareDeveloper("3002", "Software Developer");
        SoftwareDeveloper developer3= new SoftwareDeveloper("3003", "Software Developer");
        SoftwareDeveloper developer4= new SoftwareDeveloper("3004", "Software Developer");

        ceo.addEmployee(architect1);
        ceo.addEmployee(architect2);

        architect1.addEmployee(developer1);
        architect1.addEmployee(developer2);
        architect1.addEmployee(developer3);
        architect2.addEmployee(developer4);

        ceo.reportToDailyWork();
    }
}
