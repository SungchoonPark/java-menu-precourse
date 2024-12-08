package menu.dto;

import menu.domain.Category;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class RecommendResultDto {
    private final List<Category> weekCategories;
    private final Map<String, Set<String>> recommendMenus;

    public RecommendResultDto(List<Category> weekCategories, Map<String, Set<String>> recommendMenus) {
        this.weekCategories = weekCategories;
        this.recommendMenus = recommendMenus;
    }
}
