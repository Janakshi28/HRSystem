package com.icta.qualitycoder.hrapp.views;

public class ViewLeavesCommand implements Command {

    private String employeeId;

    public ViewLeavesCommand(String employeeId) {
        this.setEmployeeId(employeeId);
    }

    @Override
    public void execute() {
        System.out.println("Executing view leave command ");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
