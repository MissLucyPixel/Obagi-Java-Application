// HybridCar.java
class HybridCar {
    String model;
    double cityMPG;
    double highwayMPG;
    String batteryType;
    double batteryWeight;

    HybridCar(String model, double cityMPG, double highwayMPG, String batteryType, double batteryWeight) {
        this.model = model;
        this.cityMPG = cityMPG;
        this.highwayMPG = highwayMPG;
        this.batteryType = batteryType;
        this.batteryWeight = batteryWeight;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("City MPG: " + cityMPG);
        System.out.println("Highway MPG: " + highwayMPG);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Battery Weight: " + batteryWeight + " kg\n");
    }
}


