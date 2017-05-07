package com.icta.qualitycoder.hrapp.api;

public interface ApiFacade {
    boolean isUserAllowd(String userId);
    void createViewPaysheet(String empId);
    void viewLeaves(String empid);
}
