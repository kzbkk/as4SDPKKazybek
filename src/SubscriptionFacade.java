public class SubscriptionFacade {
    private UserService userService;
    private PlanService planService;
    private PaymentService paymentService;
    private SubscriptionService subscriptionService;
    private EmailService emailService;
    public SubscriptionFacade() {
        userService = new UserService();
        planService = new PlanService();
        paymentService = new PaymentService();
        subscriptionService = new SubscriptionService();
        emailService = new EmailService();
    }
    public void subscribe(String username, String plan) {
        if (!userService.checkUser(username)) {
            return;
        }
        double price = planService.getPrice(plan);
        if (price < 0) {
            System.out.println("Plan not found!");
            return;
        }
        if (!paymentService.pay(price)) {
            return;
        }
        subscriptionService.activate(username, plan);
        emailService.sendEmail(username);
    }
}