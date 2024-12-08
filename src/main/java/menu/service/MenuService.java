package menu.service;

import menu.domain.CategoryRecommender;
import menu.domain.MenuRecommender;

public class MenuService {
    private final MenuRecommender menuRecommender;
    private final CategoryRecommender categoryRecommender;

    public MenuService() {
        this.menuRecommender = new MenuRecommender();
        this.categoryRecommender = new CategoryRecommender();
    }
}
