package menu.constant;

public enum MenuNumConstant {
    MAX_CATEGORY_COUNT(2),

    MIN_DAY_OF_WEEK(1),
    MAX_DAY_OF_WEEK(5),
    MAX_DAY_OF_WEEK_COUNT(5),
    FIRST_MENU(0);

    private int value;

    MenuNumConstant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
