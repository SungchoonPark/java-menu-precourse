package menu.dto;

public class CoachInfoDto {
    private String name;
    private String dislikeMenus;

    public CoachInfoDto(String name, String dislikeMenus) {
        this.name = name;
        this.dislikeMenus = dislikeMenus;
    }

    public String getName() {
        return name;
    }

    public String getDislikeMenus() {
        return dislikeMenus;
    }
}
