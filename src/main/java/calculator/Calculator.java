package calculator;

public class Calculator {
    private final Parse parse;

    public Calculator(Parse parse) {
        this.parse = parse;
    }

    public int getOutput(String input) {
        int i = parse.parseCustom(input);
        int result;
        result = calculate(input,i);

        return result;
    }

    public int calculate(String input, int i) {
        int output = 0;
        for (; i<input.length(); i++) {
            if (parse.getCustom().contains(input.charAt(i))) {
                output += parse.parseInteger();
            } else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                parse.addValue(input.charAt(i));
            } else {
                System.out.println("숫자, 구분자 이외 문자 입력. 애플리케이션 종료.");
                throw new IllegalArgumentException("숫자, 구분자 이외 문자 입력. 애플리케이션 종료.");
            }
        }
        output += parse.parseInteger();
        return output;
    }
}
