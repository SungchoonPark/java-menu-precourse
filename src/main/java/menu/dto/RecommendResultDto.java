package menu.dto;

import menu.domain.Category;

import java.util.*;

public class RecommendResultDto {
    private final List<Category> weekCategories;
    private final LinkedHashMap<String, LinkedHashSet<String>> recommendMenus;

    public RecommendResultDto(
            final List<Category> weekCategories,
            final LinkedHashMap<String, LinkedHashSet<String>> recommendMenus
    ) {
        this.weekCategories = weekCategories;
        this.recommendMenus = recommendMenus;
    }

    public List<Category> getWeekCategories() {
        return weekCategories;
    }

    public Map<String, LinkedHashSet<String>> getRecommendMenus() {
        return recommendMenus;
    }
}
