package com.icta.qualitycoder.hrapp.command;

import org.clapper.classutil.ClassFinder;

public class CommandFactory {

    public static Command getCommand(String empid, String command) {
        Command executableCommand = null;
        
        ClassFinder classFinder = new ClassFinder();
        List<Class<? extends Command>> classes = classFinder.findAllMatchingTypes(Command.class);
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
