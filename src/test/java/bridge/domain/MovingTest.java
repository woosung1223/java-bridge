package bridge.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class MovingTest {

    @Test
    void 정수가_주어지면_알파벳_표현을_잘_반환하는지_테스트() {
        assertThat(Moving.getAlphabeticExpressionOf(0)).isEqualTo("D");
        assertThat(Moving.getAlphabeticExpressionOf(1)).isEqualTo("U");
    }

    @Test
    void 이해가능하지_않은_정수가_주어진_경우_예외처리_테스트() {
        assertThatThrownBy(() -> Moving.getAlphabeticExpressionOf(2))
                .isInstanceOf(IllegalStateException.class);
    }
}