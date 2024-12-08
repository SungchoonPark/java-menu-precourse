package menu.domain;

import menu.exception.ExceptionMessage;

public enum Category {
    JAPAN_FOOD(1),
    KOREA_FOOD(2),
    CHINESE_FOOD(3),
    ASIAN_FOOD(4),
    EUROPE_FOOD(5);

    private final int value;

    Category(int value) {
        this.value = value;
    }

    public static Category getCategoryByValue(int randomValue) {
        for (Category category : Category.values()) {
            if (category.value == randomValue) return category;
        }

        throw new IllegalArgumentException(ExceptionMessage.INVALID_COACH_NAME_LENGTH.getMessage());
    }
}
