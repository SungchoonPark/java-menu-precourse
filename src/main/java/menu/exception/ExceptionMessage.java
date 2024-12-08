package menu.exception;

public enum ExceptionMessage {
    COMMON_ERROR("[ERROR] "),

    INPUT_NULL("공백을 입력하시면 안됩니다."),
    INVALID_COACH_NAME_LENGTH("코치 이름은 2글자에서 4글자 사이로 입력해주세요"),
    DUPLICATE_DISLIKE_MENU("못 먹는 메뉴가 중복되었습니다."),

    INVALID_CATEGORY("해당 카테고리가 존재하지 않습니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return COMMON_ERROR.message + message;
    }
}
