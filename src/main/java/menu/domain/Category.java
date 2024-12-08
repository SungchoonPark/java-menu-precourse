package menu.domain;

import menu.exception.ExceptionMessage;

public enum Category {
    JAPAN_FOOD(1, "일식"),
    KOREA_FOOD(2, "한식"),
    CHINESE_FOOD(3, "중식"),
    ASIAN_FOOD(4, "아시안"),
    EUROPE_FOOD(5, "양식");

    private final int value;
    private final String name;

    Category(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Category getCategoryByValue(int randomValue) {
        for (Category category : Category.values()) {
            if (category.value == randomValue) return category;
        }

        throw new IllegalArgumentException(ExceptionMessage.INVALID_COACH_NAME_LENGTH.getMessage());
    }

    public String getName() {
        return name;
    }
}
