package menu.domain;

import menu.domain.coach.Coach;

public class MenuRecommender {
    private final Menus menus;

    public MenuRecommender() {
        this.menus = new Menus();
    }

    public void recommendMenuByCoachInfo(Coach coach, Category dayOfWeekCategory) {
        // 1. 랜덤하게 카테고리속 메뉴 뽑기
        String randomMenu = menus.pickRandomMenuByCategory(dayOfWeekCategory);

        // 2. 해당 메뉴가 중복됐는지, 싫어하는 메뉴인지 확인하기
        if (coach.isDislikeMenu(randomMenu) || coach.isDuplicateMenu(randomMenu)) {
            recommendMenuByCoachInfo(coach, dayOfWeekCategory);
            return;
        }

        coach.addRecommendMenu(randomMenu);
    }
}
