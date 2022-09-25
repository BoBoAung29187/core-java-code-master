package ch4introducingclassesobjectsandmethods;

// This class declares an object of type Vehicle.
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        //Notice the use of the dot minivan.mpg = 21; operator to access a member.
        // compute the range assuming a full tank of gas
                range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range);
    }
}
