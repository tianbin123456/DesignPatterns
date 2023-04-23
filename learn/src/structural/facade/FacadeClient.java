package structural.facade;

/**
 * @author tianbin
 * @date 2023/4/23
 * @Description
 * @since v1.0.0
 */
public class FacadeClient {
    public static void main(String[] args) {
        TravelGuide guide = new TravelGuide();
        BudgetPackage budgetPackage = guide.getBudgetPackage();
        budgetPackage.getTrevelPackage();
        GoldPackage goldPackage = guide.getGoldPackage();
        goldPackage.getTrevelPackage();
        LuxuryPackage luxuryPackage = guide.getLuxuryPackage();
        luxuryPackage.getTrevelPackage();
    }
}
