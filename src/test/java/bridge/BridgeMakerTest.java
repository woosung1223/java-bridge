package bridge;

import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

class BridgeMakerTest {
    @Test
    void 다리를_랜덤값에_의해_잘_생성하는지_테스트() {
        BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);

        assertRandomNumberInRangeTest(() -> {
            assertThat(bridgeMaker.makeBridge(3)).containsExactly("U", "D", "U");
        }, 1, 0, 1);
    }
}