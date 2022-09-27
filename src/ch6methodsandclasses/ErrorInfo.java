package ch6methodsandclasses;

class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int howbad[] = { 3, 3, 2, 4 };
    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            //Return an object of type Err.
        return new Err(msgs[i], howbad[i]);
    else
        return new Err("Invalid Error Code", 0);
    }
}
