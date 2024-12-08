package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryRecommender {

    public static List<Category> generateWeekCategory() {
        // 카테고리가 2번 초과해서 나와선 안됨
        List<Category> pickCategories = new ArrayList<>();
        Map<Category, Integer> weekMenus = new HashMap<>();

        int count = 0;
        while(count != 5) {
            Category randomCategory = generateRandomCategory();
            Integer categoryCount = weekMenus.getOrDefault(randomCategory, 0);

            if (categoryCount != 2) {
                weekMenus.put(randomCategory, weekMenus.getOrDefault(randomCategory, 0) + 1);
                pickCategories.add(randomCategory);
                count++;
            }
        }

        return pickCategories;
    }

    private static Category generateRandomCategory() {
        return Category.getCategoryByValue(Randoms.pickNumberInRange(1, 5));
    }
}
