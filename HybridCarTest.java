// HybridCarTest.java
public class HybridCarTest {
    public static void main(String[] args) {
        HybridCar car1 = new HybridCar("Toyota Prius", 54, 50, "Lithium-ion", 80);
        HybridCar car2 = new HybridCar("Honda Insight", 55, 49, "Nickel-metal hydride", 75);
        
        car1.displayInfo();
        car2.displayInfo();
    }
}