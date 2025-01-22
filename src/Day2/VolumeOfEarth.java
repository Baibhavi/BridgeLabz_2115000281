package Day2;

public class VolumeOfEarth {
    public static void main(String[] args) {
        float radiusOfEarth = 6378;
        double volumeOfEarthKm = (4/3) * 3.14 * radiusOfEarth*radiusOfEarth*radiusOfEarth;
        double volumeOfEarthMiles = volumeOfEarthKm * 0.6213;
        System.out.println("The volume of earth in cubic kilometers is "+volumeOfEarthKm+ " and cubic miles is "+volumeOfEarthMiles);
    }
}
