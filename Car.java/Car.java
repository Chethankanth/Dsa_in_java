import java.time.LocalTime;
import java.util.*;

public class Car {

    public HashMap<Integer, String> SpeedRecord(int dist, int car_id,HashMap<Integer, LocalTime> cam1,HashMap<Integer, LocalTime> cam2) {

        HashMap<Integer, Float> speedRecord = new HashMap<>();

        LocalTime timeA = cam1.get(car_id);
        LocalTime timeB = cam2.get(car_id);

        int timeDiff = Math.abs(timeB.toSecondOfDay() - timeA.toSecondOfDay()); // seconds

        float speed = (dist * 3600f) / timeDiff;

        speedRecord.put(car_id, speed);

        System.out.println("Car " + car_id + " Speed: " + speed + " km/h");

        if (speed > 80) {
            return FineRecord(car_id, speed);
        }

        return null;
    }

    public HashMap<Integer, String> FineRecord(int car_id, float speed) {

        HashMap<Integer, String> fineRecord = new HashMap<>();

        fineRecord.put(car_id, "Speed = " + speed + " → Speeding Fine Issued");
        fineRecord.put(1001, "Speeding Fine");
        fineRecord.put(1002, "License Suspended");

        return fineRecord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car carObj = new Car();

        HashMap<Integer, LocalTime> cam1 = new HashMap<>();
        HashMap<Integer, LocalTime> cam2 = new HashMap<>();

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nCar " + i + " Details:");

            System.out.print("Enter car ID: ");
            int car_id = sc.nextInt();

            System.out.print("Enter cam1 time (HH:MM:SS): ");
            LocalTime timeA = LocalTime.parse(sc.next());

            System.out.print("Enter cam2 time (HH:MM:SS): ");
            LocalTime timeB = LocalTime.parse(sc.next());

            System.out.print("Enter distance between cameras (km): ");
            int dist = sc.nextInt();

            cam1.put(car_id, timeA);
            cam2.put(car_id, timeB);

            HashMap<Integer, String> fine = carObj.SpeedRecord(dist, car_id, cam1, cam2);

            if (fine != null) {
                System.out.println("Fine Details for Car " + car_id + ":");
                for (Map.Entry<Integer, String> entry : fine.entrySet()) {
                    System.out.println(entry.getKey() + " → " + entry.getValue());
                }
            } else {
                System.out.println("Car " + car_id + " has No Fine.");
            }
        }

        System.out.println("\n--- All Cars Processed ---");
    }
}