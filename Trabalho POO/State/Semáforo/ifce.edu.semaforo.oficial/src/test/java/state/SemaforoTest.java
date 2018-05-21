package state;

import org.junit.Test;
import semaforostate.Semaforo;
import state.State;
import static org.junit.Assert.assertEquals;

public class SemaforoTest {
    @Test
    public void Semaforomudaparaamarelo() {
        Semaforo semaforo = new Semaforo();
        semaforo.mudarparaamarelo();

    }
}
