package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SampleTest {

    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "-1,-1,-2",
        "0x7fffffff,1,-2147483648"
    })
    void add_Test(int a, int b, int expResult){
        int result = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(result).isEqualTo(expResult);

    }

    @Test
    void mul_Test() {
        int result = sample.op(Sample.Operation.MULT, 2, 3);
        Assertions.assertThat(result).isEqualTo(6);
    }
}
