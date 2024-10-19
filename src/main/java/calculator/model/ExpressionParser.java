package calculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionParser {
    private static final String EMPTY_STRING = "";
    private static final String DEFAULT_RESULT = "0";

    private final String expression;

    public ExpressionParser(String expression) {
        this.expression = removeStandardDelimiters(expression) + DEFAULT_RESULT;
    }

    private String removeStandardDelimiters(String expression){
        for(StandardDelimiterType standardDelimiterType : StandardDelimiterType.values()){
            expression = expression.replace(standardDelimiterType.getDelimiter(), EMPTY_STRING);
        }

        return expression;
    }
}