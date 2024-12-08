package menu.dto;

import java.util.List;
import java.util.Map;

public class RecommendResultDto {

    private final Map<String, List<String>> recommendMenus;

    public RecommendResultDto(Map<String, List<String>> recommendMenus) {
        this.recommendMenus = recommendMenus;
    }
}
