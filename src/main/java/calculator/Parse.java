package calculator;

import java.util.ArrayList;
import java.util.List;

public class Parse {
    private final List<Character> custom;
    private final StringBuilder value = new StringBuilder();

    public Parse() {
        custom = new ArrayList<>();
        custom.add(',');
        custom.add(':');
    }
    public List<Character> getCustom() {
        return custom;
    }

    public int parseCustom(String input) {
        if (input.length() < 5) {
            return 0;
        }
        if (input.charAt(0) == '/') {
            if (input.charAt(1) != '/') {
                System.out.println("/만 나오므로 종료.");
                throw new IllegalArgumentException("/만 나오므로 종료");
            }
            if (input.charAt(3) != '\\') {
                System.out.println("//이후 \\이 나오지 않아 종료.");
                throw new IllegalArgumentException("//이후 \\이 나오지 않아 종료");
            }
            if (input.charAt(4) != 'n') {
                System.out.println("\\이후 n이 나오지 않아 종료.");
                throw new IllegalArgumentException("\\이후 n이 나오지 않아 종료");
            }
            if (!(custom.contains(input.charAt(2)))) {
                custom.add(input.charAt(2));
            }
            return 5;
        }
        return 0;
    }

    public int parseInteger() {
        int result = 0;
        if (!(value.isEmpty())) {
            result = Integer.parseInt(value.toString());
        }
        value.setLength(0);
        return result;
    }

    public void addValue(char c) {
        value.append(c);
    }
}
