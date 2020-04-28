package demo;

public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStartNumber() {
        if(startWithInclude()) {
            return this.input.charAt(1) - 48;
        }
        return this.input.charAt(1) - 47;
    }

    public boolean endWithInclude() {
        return this.input.endsWith("]");
    }

    public int getEndNumber() {
        if(endWithInclude()) {
            return this.input.charAt(3) - 48;
        }
        return this.input.charAt(3) - (48 + 1);
    }

    public String generate() {
        int start = getStartNumber();
        int end = getEndNumber();
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end+1; i++) {
            result.append(i).append(",");
        }
        return result.toString();
    }
}
