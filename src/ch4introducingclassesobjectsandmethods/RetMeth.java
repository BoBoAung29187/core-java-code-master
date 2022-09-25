package ch4introducingclassesobjectsandmethods;

class RetMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1 = 0, range2 = 0;
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
// get the ranges
        minivan.range();
        sportscar.range();
        System.out.println("Minivan can carry " + minivan.passengers +
                " with range of " + range1 + " Miles");
        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with range of " + range2 + " miles");
    }
}
