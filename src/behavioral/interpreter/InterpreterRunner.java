package behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Expression isJava = getJavaExpression();
        Expression isJavaEEE = getJavaEEExpression();

        System.out.println("Does developer knows java core: "+ isJava.interpret("java sprin"));
        System.out.println("Does developer knows java EE: "+ isJavaEEE.interpret("java spring"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");

        return new AndExpression(java, spring);
    }
}
