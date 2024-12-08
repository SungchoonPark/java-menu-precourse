package menu.domain.coach;

import menu.dto.CoachInfoDto;

public class Coach {
    private final String name;

    private final CoachMenu dislikeMenus;
    private final CoachMenu recommendMenus;

    public Coach(CoachInfoDto coachInfoDto) {
        this.name = coachInfoDto.getName();
        this.dislikeMenus = new CoachMenu(coachInfoDto.getDislikeMenus());
        this.recommendMenus = new CoachMenu();
    }
}
