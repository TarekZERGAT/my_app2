package dz.ztar.myapp2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyApp2ApplicationTests {

    @Test
    void contextLoads() {
        final int A = 0;
        assertThat(A>0).isTrue();
    }

}
