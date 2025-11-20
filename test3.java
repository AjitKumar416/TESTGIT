class TestRunner {
    public static void main(String[] args) {
        System.out.println("Hello from TestRunner - test build");
        System.out.println("Args: " + java.util.Arrays.toString(args));

        int a = 3, b = 4;
        System.out.printf("%d + %d = %d%n", a, b, add(a, b));

        java.util.List<String> items = java.util.List.of("apple", "banana", "cherry");
        items.stream().map(String::toUpperCase).forEach(s -> System.out.println("item: " + s));

        try {
            riskyOperation();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static void riskyOperation() throws Exception {
        throw new Exception("this is a test exception");
    }
}