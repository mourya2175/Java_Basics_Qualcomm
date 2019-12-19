package oops;

public class Encapsulation_Example {
    private int empID;
    private String empName;

    //Getter and Setter methods
    public int getEmpID(){
        return empID;
    }

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpID(int newValue){
        empID = newValue;
    }
}
