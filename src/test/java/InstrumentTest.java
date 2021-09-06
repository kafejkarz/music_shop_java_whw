import behaviours.IPlay;
import instruments.Instrument;
import instruments.Piano;
import org.junit.Before;

public class InstrumentTest {

    Instrument instrument;
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Gibson", 10, 100, "blue");
    }

}
