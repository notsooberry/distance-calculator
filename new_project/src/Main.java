import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        braking_distance braking_distance = new braking_distance();
        double s = 0;
        System.out.println("Enter the car speed: ");
        int car_speed = in.nextInt();
        System.out.println("Enter the pavement condition:\n1 — Dry\n2 — Wet\nYour choice: ");
        int road_conditions = in.nextInt();

        if(road_conditions == 1){
            System.out.println("Select the road surface: ");
            System.out.println("1 — Asphalt, concrete;");
            System.out.println("2 — Sandy Road;");
            System.out.println("3 — Rubble pavement;");
            System.out.println("4 — Dirt road;");
            System.out.println("5 — Cobblestones and paving stones.");
            System.out.println("Your choice:");
            int type_of_pavement = in.nextInt();
            s = braking_distance.braking_distance(car_speed, 1, type_of_pavement);
        }
        if(road_conditions == 2){
            System.out.println("Select the road surface: ");
            System.out.println("1 — Asphalt, concrete;");
            System.out.println("2 — Sandy Road;");
            System.out.println("3 — Rubble pavement;");
            System.out.println("4 — Dirt road;");
            System.out.println("5 — The road covered with snow;");
            System.out.println("6 — A snow-covered road;");
            System.out.println("7 — Ice");
            System.out.println("Enter");
            int type_of_pavement = in.nextInt();
            s = braking_distance.braking_distance(car_speed, 1, type_of_pavement);
        }
        System.out.println(s);
    }
}