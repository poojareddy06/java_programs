class Student {
    private String name;
    private int studentId;
    private double walletBalance;
    private int hungerLevel;
    Student(String name, int studentId, double walletBalance, int hungerLevel) {
        this.name = name;
        this.studentId = studentId;
        this.walletBalance = walletBalance;
        this.hungerLevel = hungerLevel;
    }
    public void addMoney(double amount) {
        walletBalance = walletBalance + amount;
        System.out.println("Rs." + amount + " added to wallet.");
    }
    public boolean orderFood(FoodOrder order) {
        if (hungerLevel > 80) {
            System.out.println("EMERGENCY! Feed the student immediately!");
        }
        double total = order.calculateTotal();
        if (total > walletBalance) {
            System.out.println("You don't have enough money!");
            return false;
        }
        walletBalance = walletBalance - total;
        System.out.println("Order placed successfully!");
        return true;
    }
    public void showBalance() {
        System.out.println("Wallet Balance: Rs." + walletBalance);
    }
    public String getName() {
        return name;
    }
}
class FoodOrder {
    private int orderId;
    private String foodName;
    private double price;
    private int quantity;
    FoodOrder(int orderId, String foodName, double price, int quantity) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotal() {
        double total = price * quantity;
        if (foodName.equalsIgnoreCase("Biryani")) {
            System.out.println("Student has chosen happiness");
        }
        if (quantity > 3) {
            System.out.println(
                "Bro, are you feeding the entire class?"
            );
        }
        return total;
    }
    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food: " + foodName);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + calculateTotal());
    }
}
abstract class Payment {
    abstract void pay(double amount);
}
class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment: UPI");
        System.out.println("Payment successful!");
        System.out.println("Amount paid: Rs." + amount);
    }
}
class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment: Credit Card");
        System.out.println("Payment successful!");
        System.out.println("Amount paid: Rs." + amount);
    }
}
class Cash extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment: Cash");
        System.out.println("Payment successful!");
        System.out.println("Amount paid: Rs." + amount);
    }
}
abstract class Delivery {
    abstract void deliver();
}
class BikeDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivery: Bike");
        System.out.println("Your food is coming by bike");
    }
}
class DroneDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivery: Drone");
        System.out.println("Your food is flying to you");
    }
}
public class Main1 {
    public static void main(String[] args) {
        System.out.println("===== HUNGRY STUDENT =====");
        Student student = new Student(
            "Pooja",
            101,
            500,
            90
        );
        System.out.println("Student: " + student.getName());
        System.out.println();
        FoodOrder order = new FoodOrder(
            1,
            "Biryani",
            150,
            2
        );
        order.showOrder();
        System.out.println();
        boolean orderPlaced = student.orderFood(order);
        if (orderPlaced) {
            System.out.println();
            Payment payment = new UPI();
            payment.pay(order.calculateTotal());
            System.out.println();
            Delivery delivery = new BikeDelivery();
            delivery.deliver();
            System.out.println();
            student.showBalance();
        }
    }
}

