class vehicle {
    int price = 100;
}

class car extends vehicle {
    int carTax = 50;
}

class bike extends vehicle {
    int bikeTax = 30;
}

class bus extends vehicle{
    int busTax = 80;
}

public class herInheritance {
    public static void main(String[] args) {
        car myCar = new car();
        bike myBike = new bike();
        bus myBus = new bus();

        System.out.println("Price of car is : " + (myCar.price + myCar.carTax));
        System.out.println("Price of bike is : " + (myBike.price + myBike.bikeTax));
        System.out.println("Price of bus is : " + (myBus.price + myBus.busTax));

    }
}
