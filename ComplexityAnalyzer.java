public class ComplexityAnalyzer {

    // Function to analyze the time complexity of a given function
    public static void analyzeTimeComplexity(Runnable function) {
        long startTime = System.nanoTime();
        function.run();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Time Complexity Analysis:");
        System.out.println("Execution Time: " + elapsedTime + " nanoseconds");
    }

    // Function to analyze the space complexity of a given function
    public static void analyzeSpaceComplexity(Runnable function) {
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        function.run();
        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long spaceUsed = afterMemory - beforeMemory;
        System.out.println("Space Complexity Analysis:");
        System.out.println("Memory Used: " + spaceUsed + " bytes");
    }

    public static void main(String[] args) {
        // Define your code to analyze here
        Runnable yourCodeToAnalyze = () -> {
            // Replace this with your code to analyze
            for (int i = 0; i < 1000000; i++) {
                // Some code to analyze
            }
        };

        // Analyze time complexity
        analyzeTimeComplexity(yourCodeToAnalyze);

        // Analyze space complexity
        analyzeSpaceComplexity(yourCodeToAnalyze);
    }
}
