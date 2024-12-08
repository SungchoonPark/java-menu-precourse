package menu.service;

import menu.domain.Category;
import menu.domain.CategoryRecommender;
import menu.domain.MenuRecommender;
import menu.domain.coach.Coach;
import menu.dto.RecommendResultDto;

import java.util.*;

public class MenuService {
    private final MenuRecommender menuRecommender;

    public MenuService() {
        this.menuRecommender = new MenuRecommender();
    }

    public RecommendResultDto generateRecommendMenu(List<Coach> coaches) {
        List<Category> pickCategories = CategoryRecommender.generateWeekCategory();

        for (Category dayOfWeekCategory : pickCategories) {
            for (Coach coach : coaches) {
                menuRecommender.recommendMenuByCoachInfo(coach, dayOfWeekCategory);
            }
        }

        return new RecommendResultDto(pickCategories, generateCoachRecommendMenus(coaches));
    }

    private LinkedHashMap<String, LinkedHashSet<String>> generateCoachRecommendMenus(List<Coach> coaches) {
        LinkedHashMap<String, LinkedHashSet<String>> coachRecommendMenus = new LinkedHashMap<>();

        for (Coach coach : coaches) {
            coachRecommendMenus.put(coach.getName(), coach.getRecommendMenu());
        }

        return coachRecommendMenus;
    }
}
