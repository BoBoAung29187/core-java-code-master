package ch6methodsandclasses;
// Return a programmer-defined object.
class Err {
    String msg; // error message
    int severity; // code indicating severity of error
    //Its output is shown here:
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

