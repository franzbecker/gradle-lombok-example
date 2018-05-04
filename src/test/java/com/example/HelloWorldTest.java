
package com.example;

import java.util.UUID;
import org.junit.Test;
import org.junit.Assert;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        // given
        HelloWorld obj = new HelloWorld();
        String id = UUID.randomUUID().toString();

        // when
        obj.setId(id);

        // then
        Assert.assertEquals(id, obj.getId());
    }

}
