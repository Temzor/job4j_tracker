package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpAscByName = new JobByName();
        int rsl = cmpAscByName.compare(
                new Job("Dmitrii", 0),
                new Job("Petr", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Dmitrii", 0),
                new Job("Petr", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new JobByPriority();
        int rsl = cmpPriority.compare(
                new Job("Dmitrii", 0),
                new Job("Petr", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Dmitrii", 0),
                new Job("Petr", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobByName().thenComparing(new JobByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Dmitrii", 0),
                new Job("Dmitrii", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByDescNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Dmitrii", 0),
                new Job("Dmitrii", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}