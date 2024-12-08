package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.EnumMap;
import java.util.List;

import static menu.constant.MenuNumConstant.FIRST_MENU;

public class Menus {
    private static final EnumMap<Category, List<String>> menus = new EnumMap<>(Category.class);

    static {
        menus.put(Category.JAPAN_FOOD, List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼"));
        menus.put(Category.KOREA_FOOD, List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음"));
        menus.put(Category.CHINESE_FOOD, List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채"));
        menus.put(Category.ASIAN_FOOD, List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜"));
        menus.put(Category.EUROPE_FOOD, List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"));
    }

    public String pickRandomMenuByCategory(Category category) {
        return Randoms.shuffle(menus.get(category)).get(FIRST_MENU.getValue());
    }

}
