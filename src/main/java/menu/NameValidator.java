package menu;

import menu.exception.ExceptionMessage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
    private static final Pattern VALID_NAME_PATTERN = Pattern.compile("[a-zA-Z가-힣]+");

    public static void checkCoachNameLength(String coachName) {
        if (coachName.length() < 2 || coachName.length() >4){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_COACH_NAME_LENGTH.getMessage());
        }
    }

    public static void checkValidName(String coachName) {
        Matcher matcher = VALID_NAME_PATTERN.matcher(coachName);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_COACH_NAME_FORMAT.getMessage());
        }
    }
}
