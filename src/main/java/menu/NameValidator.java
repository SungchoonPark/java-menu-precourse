package menu;

import menu.exception.ExceptionMessage;

public class NameValidator {

    public static void checkCoachNameLength(String coachName) {
        if (coachName.length() < 2 || coachName.length() >4){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_COACH_NAME_LENGTH.getMessage());
        }
    }

}
