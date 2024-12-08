package menu.dto;

import java.util.LinkedHashSet;

public class CoachInfoDto {
    private final String name;
    private final LinkedHashSet<String> dislikeMenus;

    public CoachInfoDto(final String name, final LinkedHashSet<String> dislikeMenus) {
        this.name = name;
        this.dislikeMenus = dislikeMenus;
    }

    public String getName() {
        return name;
    }

    public LinkedHashSet<String> getDislikeMenus() {
        return dislikeMenus;
    }
}
