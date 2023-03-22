package li.schinel.gloomhaven.backend;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests implements WithAssertions {

    @Test
    void contextLoads() {}

    @Test
    void testFailure() {
        assertThat(true).isFalse();
    }
}
