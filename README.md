Subscription Management — Facade Pattern

Project Description
This project demonstrates the Facade Design Pattern in Java.
The project is a simple subscription management system. It allows users to subscribe to different plans: Basic, Premium, and Student.
The Facade Pattern provides a simple interface to a complex system. Instead of calling several classes separately, the client uses one method: subscribe().

Project Structure
- Main.java — runs the program.
- SubscriptionFacade.java — coordinates the subscription process.
- UserService.java — checks the username.
- PlanService.java — checks the plan and its price.
- PaymentService.java — processes the payment.
- SubscriptionService.java — activates the subscription.
- EmailService.java — sends a confirmation message.

How It Works

When the client calls `subscribe()`, the Facade performs the following steps:
1. Checks the username.
2. Checks the subscription plan.
3. Processes the payment.
4. Activates the subscription.
5. Sends a confirmation email.

If the username or plan is invalid, the process stops.

Example

SubscriptionFacade facade = new SubscriptionFacade();
facade.subscribe("Kazybek", "Premium");

Example output:
User checked: Kazybek
Payment successful: 5000.0 KZT
Subscription activated for Kazybek
Plan: Premium
Confirmation email sent to Kazybek

Benefits of the Facade Pattern
- Makes the system easier to use.
- Hides subsystem complexity.
- Reduces dependencies between the client and subsystem classes.
- Makes the code easier to maintain.





