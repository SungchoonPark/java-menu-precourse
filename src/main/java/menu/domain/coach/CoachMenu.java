package menu.domain.coach;

import java.util.HashSet;
import java.util.Set;

public class CoachMenu {
    private Set<String> coachMenus;

    public CoachMenu(String dislikeMenus) {
        this.coachMenus = coachMenus;
    }

    public CoachMenu() {
        coachMenus = new HashSet<>();
    }
}
