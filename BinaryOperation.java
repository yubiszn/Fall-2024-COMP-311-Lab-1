import java.util.Stack;

public class BinaryOperation implements Operation {
    /**
     * Type of operation
     * @author tim
     * @version 1.0
     *
     */
    public enum Type {
        /** Add */
        Add,
        /** Sub */
        Sub,
        /** Mul */
        Mul,
        /** Div */
        Div,
        /** Eq */
        Eq,
        /** Ne */
        Ne,
        /** Lt */
        Lt,
        /** Lte */
        Lte,
        /** Gt */
        Gt,
        /** Gte */
        Gte
    }

    private Type type;

    public BinaryOperation(Type type) {
        this.type = type;
    }

    @Override
    public int execute(int programCounter, Stack<Integer> stack,
            int[] globals) {

        switch(type) {
            case Add:
                break;
        }

        return 0;
    }

}
