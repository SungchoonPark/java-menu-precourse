package menu.domain.coach;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CoachMenu {
    private LinkedHashSet<String> coachMenus;

    public CoachMenu(LinkedHashSet<String> dislikeMenus) {
        this.coachMenus = dislikeMenus;
    }

    public CoachMenu() {
        coachMenus = new LinkedHashSet<>();
    }

    public boolean isDislikeMenu(String menu) {
        if (coachMenus.contains(menu)) return true;
        return false;
    }

    public boolean isDuplicateMenu(String menu) {
        if (coachMenus.contains(menu)) return true;
        return false;
    }

    public void addMenu(String randomMenu) {
        coachMenus.add(randomMenu);
    }

    public LinkedHashSet<String> getRecommendMenus() {
        return coachMenus;
    }
}
