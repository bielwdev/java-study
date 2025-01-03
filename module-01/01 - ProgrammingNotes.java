/**
 * Complete Java Course - Chapter: Introduction to Programming
 * Source: http://educandoweb.com
 * Professor: Dr. Nelio Alves
 */

public class ProgrammingConcepts {

    // Algorithm
    /**
     * Algorithm: Finite sequence of instructions to solve a problem.
     * Example: Washing dirty clothes.
     */
    public static void exampleAlgorithm() {
        String[] steps = {
                "1) Put the clothes in a container",
                "2) Add some soap and fabric softener",
                "3) Fill with water",
                "4) Mix everything until the soap dissolves",
                "5) Soak for twenty minutes",
                "6) Scrub the clothes",
                "7) Rinse",
                "8) Wring out"
        };
        for (String step : steps) {
            System.out.println(step);
        }
    }

    // Automation
    /**
     * Automation: Using machines to perform procedures automatically or semi-automatically.
     */

    // Computer Program
    /**
     * Computer program: An algorithm executed by a computer.
     * Example: Data processing or calculations.
     */

    // Programming Language
    /**
     * Programming Language:
     * - A set of lexical (spelling) and syntactical (grammar) rules.
     * - Examples: Java, Python, C++, C#, Ruby, PHP, JavaScript, etc.
     */

    // IDE - Integrated Development Environment
    /**
     * IDE: A set of software tools for program development.
     * Examples:
     * - Java: Eclipse, NetBeans.
     * - C/C++: Code Blocks.
     * - C#: Microsoft Visual Studio.
     */

    // Compilation and Interpretation
    /**
     * Execution Models:
     * - Compilation: Generates executable code for the operating system.
     * - Interpretation: Executes source code on-demand.
     * - Hybrid Approach: Compiles to bytecode and interprets using a virtual machine.
     */

    public static void main(String[] args) {
        System.out.println("Basic Programming Concepts:");
        exampleAlgorithm();
    }
}
