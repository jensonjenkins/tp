package seedu.duke.parser;

import seedu.duke.command.Command;
import seedu.duke.command.AddCommand;

import java.util.Map;

public class AddCommandMetadata extends CommandMetadata {
    private static final String ADD_KEYWORD = "add";
    private static final String[] ADD_ARGUMENTS = {"courseCode", "semester"};

    public AddCommandMetadata() {
        super(ADD_KEYWORD, ADD_ARGUMENTS);
    }

    // Add Command Creator
    @Override
    protected Command createCommandInstance(Map<String, String> args) {
        String moduleCode = args.getOrDefault("courseCode", "COURSECODE_ERROR");
        String semester = args.getOrDefault("semester", "SEMESTER_ERROR");
        int semesterInt = Integer.parseInt(semester);
        return new AddCommand(moduleCode, semesterInt);
    }
}
