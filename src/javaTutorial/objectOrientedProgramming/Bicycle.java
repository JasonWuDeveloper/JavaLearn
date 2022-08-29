package javaTutorial.objectOrientedProgramming;

interface Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue);

    void  changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

//    void printStates() {
//        System.out.println(" cadence: " + cadence + " speed: " + speed + " gear: " + gear);;
//    }
}
