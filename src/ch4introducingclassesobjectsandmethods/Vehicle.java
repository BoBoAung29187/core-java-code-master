package ch4introducingclassesobjectsandmethods;
/*
   Add a parameterized method that computes the
   fuel required for a given distance.
*/
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

//    public Vehicle(int i, int i1, int i2) {
//    }
    // Return the range.

    int range() {
        return mpg * fuelcap;
    }
    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
