public class Bicycle
{
    int speed = 0;
    int gear = 1;
    int cadence = 0;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("cadence:" +
                cadence + " speed: "+
                speed + " gear: " + gear);
    }
}
