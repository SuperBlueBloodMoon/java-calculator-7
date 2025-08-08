package calculator;

public class Calculator {

    public int getOutput(String input) {
        int output = 0;
        String value = "";
        String delimiter = "";
        int i = 0;
        if (input.charAt(0) == '/') {
            delimiter += input.charAt(2);
            i = 5;
        }
        for (; i<input.length(); i++) {
            if ((int) input.charAt(i) == 44) {
                if (!(value.isEmpty())) {
                    output += Integer.parseInt(value);
                    value = "";
                }
            } else if ((int) input.charAt(i) == 58) {
                if (!(value.isEmpty())) {
                    output += Integer.parseInt(value);
                    value = "";
                }

            } else if ((int) input.charAt(i) >= 48 && (int) input.charAt(i) <= 57) {
                value += input.charAt(i);
            } else if (!(delimiter.isEmpty())) {
                if (input.charAt(i) == delimiter.charAt(0)) {
                    if (!(value.isEmpty())) {
                        output += Integer.parseInt(value);
                        value = "";
                    }
                }
            } else {
                throw new IllegalArgumentException("애플리케이션 종료.");
            }
        }
        if(!(value.isEmpty())) {
            output += Integer.parseInt(value);
        }
        return output;
    }
}
