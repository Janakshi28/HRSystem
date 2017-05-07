package com.icta.qualitycoder.hrapp.api;

import com.icta.qualitycoder.hrapp.command.Command;
import com.icta.qualitycoder.hrapp.command.CommandFactory;
import com.icta.qualitycoder.hrapp.command.ViewLeavesCommand;
import com.icta.qualitycoder.hrapp.command.ViewPaySheetCommad;
import com.icta.qualitycoder.hrapp.security.SecurityManager;
import com.icta.qualitycoder.hrapp.security.SecurityManagerImpl;

public class ApiFacadeImpl implements ApiFacade {

    private SecurityManager manager = new SecurityManagerImpl();

    public boolean isUserAllowd(String userId) {
        return manager.isAllowd(userId);
    }

    public void createViewPaysheet(String empId) {
        Command command = CommandFactory.getCommand(empId, ViewPaySheetCommad.class.getSimpleName());
        command.execute();
    }

    @Override
    public void viewLeaves(String empid) {
        Command command = CommandFactory.getCommand(empid, ViewLeavesCommand.class.getSimpleName());
        command.execute();
        
    }

}
