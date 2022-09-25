package ch4introducingclassesobjectsandmethods;
class Factor {
    boolean isFactor(int a, int b) {
        //This method has two parameters.
        if ((b % a) == 0) return true;
        else return false;
    }
}
