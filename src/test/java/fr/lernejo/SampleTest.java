package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_add_equals() {
        Sample sample = new Sample();
        Assertions.assertEquals(15,sample.op(Sample.Operation.ADD,5,10));
    }
    @Test
    void op_not_null() {
        Sample sample = new Sample();
        Assertions.assertNotNull(sample);
    }

}
