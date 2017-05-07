package com.icta.qualitycoder.hrapp.views;

public class CommandFactory {

    public static Command getCommand(String empid, String command) {
        
        Command executableCommand = null;

        switch (command) {
            case "ViewPaySheetCommad":
                executableCommand = new ViewPaySheetCommad(empid);
            case "ViewLeavesCommand":
                executableCommand = new ViewLeavesCommand(empid);
            default:
                break;
        }
        return executableCommand;
    }

}
