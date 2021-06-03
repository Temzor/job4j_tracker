
package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfileTest {
    @Test
    public void whenAddressShow() {
        Address addressOne = new Address("Moscow", "40 years of October", 5, 16);
        Address addressTwo = new Address("Saint Petersburg", "Big prospect P side", 40, 208);
        Address addressThree = new Address("Yekaterinburg", "Blucher street", 18, 403);
        Address addressFour = new Address("Kazan", "Karl Marks street", 402, 908);
        Address addressFive = new Address("Chelyabinsk", "Kirova street", 8, 53);

        Profile profile1 = new Profile(addressOne);
        Profile profile2 = new Profile(addressTwo);
        Profile profile3 = new Profile(addressThree);
        Profile profile4 = new Profile(addressFour);
        Profile profile5 = new Profile(addressFive);

        List<Profile> collectProfile = Arrays.asList(profile1, profile2,
                profile3, profile4, profile5);
        List<Address> result  = Profiles.collect(collectProfile);
        List<Address> expected  = Arrays.asList(addressOne, addressTwo,
                addressThree, addressFour, addressFive);
        expected.sort(Comparator.comparing(Address::getCity));
        assertEquals(result, expected);

    }

    @Test
    public void whenAddressDuplicateShow() {
        Address addressOne = new Address("Moscow", "40 years of October", 5, 16);
        Address addressTwo = new Address("Moscow", "40 years of October", 5, 16);
        Address addressThree = new Address("Yekaterinburg", "Blucher street", 18, 403);
        Address addressFour = new Address("Yekaterinburg", "Blucher street", 18, 403);
        Address addressFive = new Address("Yekaterinburg", "Blucher street", 18, 403);

        Profile profile1 = new Profile(addressOne);
        Profile profile2 = new Profile(addressTwo);
        Profile profile3 = new Profile(addressThree);
        Profile profile4 = new Profile(addressFour);
        Profile profile5 = new Profile(addressFive);

        List<Profile> collectProfile = Arrays.asList(profile1, profile2,
                profile3, profile4, profile5);
        List<Address> result  = Profiles.collect(collectProfile);
        List<Address> expected  = Arrays.asList(addressOne,
                addressThree);
        expected.sort(Comparator.comparing(Address::getCity));
        assertEquals(result, expected);

    }
}