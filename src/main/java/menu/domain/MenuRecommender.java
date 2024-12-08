package menu.domain;

import menu.domain.coach.Coach;

public class MenuRecommender {
    private final Menus menus;

    public MenuRecommender() {
        this.menus = new Menus();
    }

    public void recommendMenuByCoachInfo(Coach coach, Category dayOfWeekCategory) {
        String randomMenu = pickRandomMenuByCategory(dayOfWeekCategory);
        checkValidRandomMenu(coach, dayOfWeekCategory, randomMenu);
        coach.addRecommendMenu(randomMenu);
    }

    private String pickRandomMenuByCategory(Category dayOfWeekCategory) {
        return menus.pickRandomMenuByCategory(dayOfWeekCategory);
    }

    private void checkValidRandomMenu(Coach coach, Category dayOfWeekCategory, String randomMenu) {
        if (coach.isDislikeMenu(randomMenu) || coach.isDuplicateMenu(randomMenu)) {
            recommendMenuByCoachInfo(coach, dayOfWeekCategory);
        }
    }
}
