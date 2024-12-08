package menu.dto;

import java.util.List;
import java.util.Set;

public class CoachInfoDto {
    private String name;
    private Set<String> dislikeMenus;

    public CoachInfoDto(String name, Set<String> dislikeMenus) {
        this.name = name;
        this.dislikeMenus = dislikeMenus;
    }

    public String getName() {
        return name;
    }

    public Set<String> getDislikeMenus() {
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
