package com.theironyard;

import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.output.OutputStreamInterceptor;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ArrayKatasTest extends TestifierTest{

    @Test
    public void testSumArrayOfFiveNumbers() {
        /* arrange */

        /* act */
        double sum = 0;
        try {
            sum = (double) Invoker.invokeStatic(ArrayKatas.class, "sumArray", new Object[]{new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6}});
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("sum of 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 should be 23.1",
                sum, equalTo(23.1));
    }

    @Test
    public void testSumArrayOfZeroNumbers() {
        /* arrange */

        /* act */
        double sum = 0;
        try {
            sum = (double) Invoker.invokeStatic(ArrayKatas.class, "sumArray", new Object[]{new double[]{}});
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("sum of no numbers should be 0.0",
                sum, closeTo(0.0, 0.001));
    }

    @Test
    public void testSumArrayOfUsesForEachLoop(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("sumArray", double[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should do something.",
                source, RegexMatcher.matches("^.*?ForeachStmt.*?$"));
    }

    @Test
    public void testConcatenateStringsOfFiveWords() {
        /* arrange */

        /* act */
        String result = "";
        try {
            result = (String) Invoker.invokeStatic(ArrayKatas.class, "concatenateStrings", new Object[]{new String[]{"This", "is", "five", "words", "together"}});
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("concatenation of \"This\", \"is\", \"five\", \"words\", \"together\" should be \"Thisisfivewordstogether\"",
                result, equalTo("Thisisfivewordstogether"));
    }

    @Test
    public void testConcatenateStringsOfZeroWords() {
        /* arrange */

        /* act */
        String result = "";
        try {
            result = (String) Invoker.invokeStatic(ArrayKatas.class, "concatenateStrings", new Object[]{new String[]{}});
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("concatenation of \"This\", \"is\", \"five\", \"words\", \"together\" should be \"Thisisfivewordstogether\"",
                result, equalTo(""));
    }

    @Test
    public void testConcatenateStringsUsesForLoop(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("concatenateStrings", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The main() method should do something.",
                source, RegexMatcher.matches("^.*?ForStmt.*?$"));
    }

    @Test
    public void testReverseArrayOfFiveObjects() {
        /* arrange */

        /* act */
        Object[] result = new Object[0];
        try {
            result = (Object[]) Invoker.invokeStatic(ArrayKatas.class, "reverseArray", new Object[]{new Object[]{"This", 1, null, true, 32.1}});
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("reverse of \"This\", 1, null, true, 32.1 should be 32.1, true, null, 1, \"This\"",
                result, equalTo(new Object[]{32.1, true, null, 1, "This"}));
    }

    @Test
    public void testReverseArrayOfZeroObjects() {
        /* arrange */

        /* act */
        Object[] result = new Object[0];
        try {
            result = (Object[]) Invoker.invokeStatic(ArrayKatas.class, "reverseArray", new Object[]{new Object[]{}});
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("reverse of empty array should be an empty array",
                result, equalTo(new Object[]{}));
    }
}