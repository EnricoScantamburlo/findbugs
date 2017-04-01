package it.enricoscantamburlo.secondmodule;

/**
 *
 * @author Enrico Scantamburlo <scantamburlo at streamsim.com>
 */
public class DummyClass {

    public void doSomething(Object a) {
        if (a != null) {
            a.toString(); // this causes an exception
        }
    }
}
