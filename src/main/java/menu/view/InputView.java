package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.exception.ExceptionMessage;

public class InputView {
    private static final String START_MESSAGE = "점심 메뉴 추천을 시작합니다.\n";
    private static final String COACH_NAME_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String DISLIKE_MENU_MESSAGE = "\n%s(이)가 못 먹는 메뉴를 입력해 주세요.";

    public String readCoachNames() {
        System.out.println(COACH_NAME_MESSAGE);
        String coachNames = Console.readLine();
        checkInputIsEmpty(coachNames);
        return coachNames;
    }

    private void checkInputIsEmpty(String inputValue) {
        if (inputValue.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessage.INPUT_NULL.getMessage());
        }
    }

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public String readDislikeMenu(String coachName) {
        System.out.println(String.format(DISLIKE_MENU_MESSAGE, coachName));
        return Console.readLine();
    }
}
