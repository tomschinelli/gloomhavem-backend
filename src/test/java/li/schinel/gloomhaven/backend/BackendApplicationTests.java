package li.schinel.gloomhaven.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @SpringBootTest()
@ActiveProfiles("test")
class BackendApplicationTests {

    @Test
    void contextLoads() {}
}
