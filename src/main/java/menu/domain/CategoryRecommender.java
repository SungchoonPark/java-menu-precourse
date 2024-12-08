package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static menu.constant.MenuNumConstant.*;

public class CategoryRecommender {

    public static List<Category> generateWeekCategory() {
        List<Category> pickCategories = new ArrayList<>();
        Map<Category, Integer> weekMenus = new HashMap<>();

        int count = 0;
        while (count != MAX_DAY_OF_WEEK_COUNT.getValue()) {
            Category randomCategory = generateRandomCategory();
            Integer categoryCount = weekMenus.getOrDefault(randomCategory, 0);

            if (categoryCount != MAX_CATEGORY_COUNT.getValue()) {
                weekMenus.put(randomCategory, weekMenus.getOrDefault(randomCategory, 0) + 1);
                pickCategories.add(randomCategory);
                count++;
            }
        }

        return pickCategories;
    }

    private static Category generateRandomCategory() {
        return Category.getCategoryByValue(Randoms.pickNumberInRange(MIN_DAY_OF_WEEK.getValue(), MAX_DAY_OF_WEEK.getValue()));
    }
}
