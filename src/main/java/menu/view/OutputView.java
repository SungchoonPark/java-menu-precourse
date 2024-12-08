package menu.view;

import menu.domain.Category;
import menu.dto.RecommendResultDto;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class OutputView {
    private static final String RESULT_MESSAGE = "\n메뉴 추천 결과입니다.\n";
    private static final String COMPLETE_MESSAGE = "\n추천을 완료했습니다.";
    private static final String HEADER_MESSAGE = "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]\n";
    private static final String CATEGORY = "[ 카테고리 ";

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }

    public void printResult(RecommendResultDto recommendResultDto) {
        StringBuilder result = new StringBuilder();

        result.append(RESULT_MESSAGE);
        result.append(HEADER_MESSAGE);
        result.append(CATEGORY);

        for (Category weekCategory : recommendResultDto.getWeekCategories()) {
            result.append("| ").append(weekCategory.getName()).append(" ");
        }
        result.append("]\n");

        Map<String, LinkedHashSet<String>> recommendMenus = recommendResultDto.getRecommendMenus();
        Set<Map.Entry<String, LinkedHashSet<String>>> entries = recommendMenus.entrySet();
        for (Map.Entry<String, LinkedHashSet<String>> coachMenus : entries) {
            result.append("[ ").append(coachMenus.getKey()).append(" ");

            for (String recommendMenu : coachMenus.getValue()) {
                result.append("| ").append(recommendMenu).append(" ");
            }
            result.append("]\n");
        }
        result.append(COMPLETE_MESSAGE);

        System.out.print(result);
    }
}
