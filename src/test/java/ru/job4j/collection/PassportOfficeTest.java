package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void addTrue() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addDuplicate() {
        Citizen citizen = new Citizen("16g82f", "Dmitrii Kapustin");
        Citizen citizen1 = new Citizen("16g82f", "Dmitrii Kapustin");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean rsl = office.add(citizen1);
        assertThat(rsl, is(false));

    }
}