package foo;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

@MicronautTest
public class FooTest {

    @Inject
    DataSource dataSource; // "default" will be injected

    @Inject
    @Named("another")
    DataSource another;

    @Test
    void testItWorks() {
        Assertions.assertNotNull(dataSource);
        Assertions.assertNotNull(another);
    }

}
