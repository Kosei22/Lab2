package Lab2;

public class driver {
    public static void main(String[] args) {
        Canada canada = new Canada();
        canada.displayAllProvinces();
        System.out.println(canada.getNumOfProvincesBetween(1, 15));
    }
}
