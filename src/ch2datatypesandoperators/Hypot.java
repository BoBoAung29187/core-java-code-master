package ch2datatypesandoperators;

/*
   Use the Pythagorean theorem to
   find the length of the hypotenuse
   given the lengths of the two opposing
   sides.
*/
class Hypot {
    public static void main(String[] args) {
        double x, y, z;
        x = 3; y = 4;
        //Notice how sqrt( ) is called. It is preceded by the name of the class of which it is a member.
        z = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse is " +z);
    }
}
