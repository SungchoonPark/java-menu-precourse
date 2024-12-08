package menu.constant;

public enum MenuConstant {
    DELIMITER(",");

    private String value;

    MenuConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
