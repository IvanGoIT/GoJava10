package lessons.lesson7.enumdemo;

public enum IntEnumExample {
    SIGN_CREATE(10),
    SIGN_CREATE_BONUS(1000),
    HOME_SCREEN(20),
    REGISTER_SCREEN(3);

    private final int value;

    IntEnumExample(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}

