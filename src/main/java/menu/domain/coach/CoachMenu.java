package menu.domain.coach;

import java.util.HashSet;
import java.util.Set;

public class CoachMenu {
    private Set<String> coachMenus;

    public CoachMenu(Set<String> dislikeMenus) {
        this.coachMenus = dislikeMenus;
    }

    public CoachMenu() {
        coachMenus = new HashSet<>();
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

    public Set<String> getRecommendMenus() {
        return coachMenus;
    }
}
