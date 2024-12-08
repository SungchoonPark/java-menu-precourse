package menu.controller;

import menu.NameValidator;
import menu.domain.coach.Coach;
import menu.dto.CoachInfoDto;
import menu.dto.RecommendResultDto;
import menu.exception.ExceptionMessage;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.*;

import static menu.constant.MenuConstant.*;
import static menu.constant.MenuNumConstant.*;

public class MenuController {
    private final InputView inputView;
    private final OutputView outputView;
    private final MenuService menuService;

    public MenuController(InputView inputView, OutputView outputView, MenuService menuService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.menuService = menuService;
    }

    public void run() {
        printStartMessage();
        List<String> coachNames = readCoachNames();

        List<Coach> coaches = new ArrayList<>();
        for (String coachName : coachNames) {
            coaches.add(new Coach(readDislikeMenuOfCoach(coachName)));
        }

        printRecommendResult(menuService.generateRecommendMenu(coaches));
    }

    private void printRecommendResult(RecommendResultDto recommendResultDto) {
        outputView.printResult(recommendResultDto);
    }

    private void printStartMessage() {
        inputView.printStartMessage();
    }

    private List<String> readCoachNames() {
        while(true) {
            try {
                String coachNames = inputView.readCoachNames();
                return Arrays.stream(coachNames.split(DELIMITER.getValue()))
                        .peek(NameValidator::checkCoachNameLength)
                        .peek(NameValidator::checkValidName)
                        .toList();
            } catch (IllegalArgumentException exception) {
                outputView.printExceptionMessage(exception.getMessage());
            }
        }
    }

    private CoachInfoDto readDislikeMenuOfCoach(String coachName) {
        while(true) {
            try {
                String dislikeMenus = inputView.readDislikeMenu(coachName);
                return new CoachInfoDto(
                        coachName,
                        splitDislikeMenuOfCoach(dislikeMenus));
            } catch (IllegalArgumentException exception) {
                outputView.printExceptionMessage(exception.getMessage());
            }
        }
    }

    private LinkedHashSet<String> splitDislikeMenuOfCoach(String dislikeMenus) {
        LinkedHashSet<String> uniqueDislikeMenus = new LinkedHashSet<>();

        for (String menu : dislikeMenus.split(DELIMITER.getValue())) {
            checkDuplicateDislikeMenu(uniqueDislikeMenus.contains(menu));
            uniqueDislikeMenus.add(menu);
            checkOverDislikeMenuCount(uniqueDislikeMenus);
        }

        return uniqueDislikeMenus;
    }

    private static void checkOverDislikeMenuCount(LinkedHashSet<String> uniqueDislikeMenus) {
        if (uniqueDislikeMenus.size() > MAX_CATEGORY_COUNT.getValue()) {
            throw new IllegalArgumentException(ExceptionMessage.OVER_DISLIKE_MENU_COUNT.getMessage());
        }
    }

    private static void checkDuplicateDislikeMenu(boolean uniqueDislikeMenus) {
        if (uniqueDislikeMenus) {
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_DISLIKE_MENU.getMessage());
        }
    }
}
