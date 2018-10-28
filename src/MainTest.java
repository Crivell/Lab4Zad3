import com.google.common.base.Splitter;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;
import java.util.Spliterators;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test(){
        List<String> l1 = Main.rozString("Ala ma kota", 4);
        List<String> l2 = Splitter.fixedLength(4).splitToList("Ala ma kota");
        assertThat(l1,is(l2));
    }


}