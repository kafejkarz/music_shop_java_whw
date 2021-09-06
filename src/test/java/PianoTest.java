import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", 120, 195, "black");
    }

    @Test
    public void canPlayString(){
        assertEquals("nice sound", this.piano.canPlay());
    }


}
