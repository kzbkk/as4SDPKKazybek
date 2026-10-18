public class PlanService {
    public double getPrice(String plan) {
        if (plan.equalsIgnoreCase("Basic")) {
            return 2000;
        } else if (plan.equalsIgnoreCase("Premium")) {
            return 5000;
        } else if (plan.equalsIgnoreCase("Student")) {
            return 1000;
        }
        return -1;
    }
}