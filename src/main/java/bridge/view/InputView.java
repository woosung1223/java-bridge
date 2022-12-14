package bridge.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final String READING_BRIDGE_SIZE_MESSAGE = "다리의 길이를 입력해주세요.";
    private final String READING_MOVING_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private final String READING_GAME_COMMAND_MESSAGE = "게임을 다시 시도할지 여부를 선택해주세요. (재시도: R, 종료: Q)";

    public int readBridgeSize() {
        System.out.println(READING_BRIDGE_SIZE_MESSAGE);
        String line = Console.readLine();
        return Integer.parseInt(line);
    }

    public String readMoving() {
        System.out.println(READING_MOVING_MESSAGE);
        String line = Console.readLine();
        return line;
    }

    public String readGameCommand() {
        System.out.println(READING_GAME_COMMAND_MESSAGE);
        String line = Console.readLine();
        return line;
    }
}
