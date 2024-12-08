package menu.controller;

import menu.NameValidator;
import menu.dto.CoachInfoDto;
import menu.exception.ExceptionMessage;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.*;

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

        List<CoachInfoDto> coachInfoDtos = new ArrayList<>();
        for (String coachName : coachNames) {
            CoachInfoDto coachInfoDto = readDislikeMenuOfCoach(coachName);
            System.out.println(coachInfoDto);
            coachInfoDtos.add(coachInfoDto);
        }

    }

    private void printStartMessage() {
        inputView.printStartMessage();
    }

    private List<String> readCoachNames() {
        while(true) {
            try {
                String coachNames = inputView.readCoachNames();
                return Arrays.stream(coachNames.split(","))
                        .peek(NameValidator::checkCoachNameLength)
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
                String[] split = dislikeMenus.split(",");
                Set<String> uniqueDislikeMenus = new HashSet<>();
                for (String menu : split) {
                    if (uniqueDislikeMenus.contains(menu)) {
                        throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_DISLIKE_MENU.getMessage());
                    }

                    uniqueDislikeMenus.add(menu);
                }

                return new CoachInfoDto(coachName, uniqueDislikeMenus);
            } catch (IllegalArgumentException exception) {
                outputView.printExceptionMessage(exception.getMessage());
            }
        }
    }
}
