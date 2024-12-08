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
}
