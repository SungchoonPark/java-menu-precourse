package menu.service;

import menu.domain.Category;
import menu.domain.CategoryRecommender;
import menu.domain.MenuRecommender;
import menu.domain.coach.Coach;
import menu.dto.RecommendResultDto;

import java.util.List;

public class MenuService {
    private final MenuRecommender menuRecommender;

    public MenuService() {
        this.menuRecommender = new MenuRecommender();
    }

    public RecommendResultDto generateRecommendMenu(List<Coach> coach) {
        // Todo : 1. (월~금) 카테고리 생성하기
        List<Category> pickCategories = CategoryRecommender.generateWeekCategory();
        // Todo: 2. 해당 카테고리를 기준으로 각 요일별 각코치의 메뉴를 추천해줌.

        return null;
    }
}
