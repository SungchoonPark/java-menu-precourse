package menu.domain;

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
}
