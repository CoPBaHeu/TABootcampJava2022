package sef.FinalActivity.FirstActivity;

public class IllegalNameException extends Exception{
    /*//public String getMessage(){
        return "Incorrect symbols in field Name";
    }*/
    public IllegalNameException(String errorMessage){
        super(errorMessage);
    }
}
