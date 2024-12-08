package menu.domain.coach;

import java.util.LinkedHashSet;

public class CoachMenu {
    private final LinkedHashSet<String> coachMenus;

    public CoachMenu(final LinkedHashSet<String> dislikeMenus) {
        this.coachMenus = dislikeMenus;
    }

    public CoachMenu() {
        coachMenus = new LinkedHashSet<>();
    }

    public boolean isDislikeMenu(String menu) {
        return coachMenus.contains(menu);
    }

    public boolean isDuplicateMenu(String menu) {
        return coachMenus.contains(menu);
    }

    public void addMenu(String randomMenu) {
        coachMenus.add(randomMenu);
    }

    public LinkedHashSet<String> getRecommendMenus() {
        return coachMenus;
    }
}
