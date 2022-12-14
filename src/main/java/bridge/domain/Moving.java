package bridge.domain;

import java.util.Arrays;

public enum Moving {
    DOWN("D", 0),
    UP("U", 1);

    private final static String NO_PROPER_MOVING_VALUE = "[ERROR] 해당 숫자표현에 맞는 Moving 객체가 없습니다.";

    private final String alphabeticExpression;
    private final int numericExpression;

    Moving(String alphabeticExpression, int numericExpression) {
        this.alphabeticExpression = alphabeticExpression;
        this.numericExpression = numericExpression;
    }

    public static String getAlphabeticExpressionOf(int numericExpression) {
        return Arrays.stream(values())
                .filter(moving -> moving.numericExpression == numericExpression)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(NO_PROPER_MOVING_VALUE))
                .alphabeticExpression;
    }
}
