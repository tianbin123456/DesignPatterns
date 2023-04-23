package structural.facade;

/**
 * @author tianbin
 * @date 2023/4/23
 * @Description
 * @since v1.0.0
 */
public class TravelGuide {
    private BudgetPackage budgetPackage;
    private GoldPackage goldPackage;
    private LuxuryPackage luxuryPackage;

    public BudgetPackage getBudgetPackage() {
        budgetPackage = new BudgetPackage();
        return budgetPackage;
    }

    public GoldPackage getGoldPackage() {
        goldPackage = new GoldPackage();
        return goldPackage;
    }

    public LuxuryPackage getLuxuryPackage() {
        luxuryPackage = new LuxuryPackage();
        return luxuryPackage;
    }
}
