package com.icta.qualitycoder.hrapp.views;

public class ViewPaySheetCommad implements Command {

   private String employeeId;
   
    public ViewPaySheetCommad(String employeeId) {
        this.setEmployeeId(employeeId);
    }

    public void execute() {
       System.out.println("Executing viewPaySheet");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
