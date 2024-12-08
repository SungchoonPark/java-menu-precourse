package menu.dto;

import java.util.LinkedHashSet;
import java.util.Set;

public class CoachInfoDto {
    private String name;
    private LinkedHashSet<String> dislikeMenus;

    public CoachInfoDto(String name, LinkedHashSet<String> dislikeMenus) {
        this.name = name;
        this.dislikeMenus = dislikeMenus;
    }

    public String getName() {
        return name;
    }

    public LinkedHashSet<String> getDislikeMenus() {
        return dislikeMenus;
    }

    @Override
    public String toString() {
        return "CoachInfoDto{" +
                "name='" + name + '\'' +
                ", dislikeMenus=" + dislikeMenus +
                '}';
    }
}
