public class Comparison {
    public static void main(String[] args){
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();


        int car_wheels = 4;
        int motorcycle_wheels = 2;
        int car_seats = 5;
        int motorcycle_seats = 2;
        int car_speed = 180;
        int motorcycle_speed = 113;

        if (car.number_of_wheels(car_wheels)>= motorcycle.number_of_wheels(motorcycle_wheels)){
            System.out.println("The car has more seats than motorcycle");
        } else {
            System.out.println("The motorcycle has more seats than motorcycle");
        }
        if (car.number_of_seats(car_seats)>= motorcycle.number_of_seats(motorcycle_seats)){
            System.out.println("The car has more wheels than motorcycle");
        } else {
            System.out.println("The motorcycle has more seats than car");
        }
        if (car.max_speed(car_speed)>= motorcycle.max_speed(motorcycle_speed)){
            System.out.println("The car is faster than motorcycle");
        } else {
            System.out.println("The motorcycle is faster than car");
        }
    }

}
