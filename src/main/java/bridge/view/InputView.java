package bridge.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public int readBridgeSize() {
        String line = Console.readLine();
        return Integer.parseInt(line);
    }

    public String readMoving() {
        String line = Console.readLine();
        return line;
    }

    public String readGameCommand() {
        String line = Console.readLine();
        return line;
    }
}
