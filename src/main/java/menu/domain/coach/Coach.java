package menu.domain.coach;

import menu.dto.CoachInfoDto;

import java.util.Set;

public class Coach {
    private final String name;

    private final CoachMenu dislikeMenus;
    private final CoachMenu recommendMenus;

    public Coach(CoachInfoDto coachInfoDto) {
        this.name = coachInfoDto.getName();
        this.dislikeMenus = new CoachMenu(coachInfoDto.getDislikeMenus());
        this.recommendMenus = new CoachMenu();
    }

    public boolean isDislikeMenu(String menu) {
        return dislikeMenus.isDislikeMenu(menu);
    }

    public boolean isDuplicateMenu(String menu) {
        return recommendMenus.isDuplicateMenu(menu);
    }

    public void addRecommendMenu(String randomMenu) {
        recommendMenus.addMenu(randomMenu);
    }

    public String getName() {
        return name;
    }

    public Set<String> getRecommendMenu() {
        return recommendMenus.getRecommendMenus();
    }
}
