public class braking_distance {
    int brake_factor = 1;
    double s;

    public double braking_distance(int car_speed, int road_conditions, int type_of_pavement) {
        if (road_conditions == 1) {
            switch (type_of_pavement) {
                case 1:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.8);
                    break;
                case 2:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.7);
                    break;
                case 3:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.7);
                    break;
                case 4:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.6);
                    break;
                case 5:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.55);
                    break;
            }
        }
        if(road_conditions == 2){
            switch (type_of_pavement){
                case 1:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.55);
                    break;
                case 2:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.65);
                    break;
                case 3:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.5);
                    break;
                case 4:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.5);
                    break;
                case 5:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.4);
                    break;
                case 6:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.25);
                    break;
                case 7:
                    s = (brake_factor * (car_speed * car_speed)) / (254 * 0.25);
                    break;
            }
        }
        return s;
    }
}