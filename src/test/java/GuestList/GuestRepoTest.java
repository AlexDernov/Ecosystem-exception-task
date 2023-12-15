package GuestList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GuestRepoTest {
    @Test
            //Give
    GuestRepo guestList = new GuestRepo();
    //when
    guestList.setGuestList(new ArrayList<Guest>());
    List<String> guestStr = guestList.getGuestList();
    //then
    void assertTrue(guestList.getGuestList().isEmpty());

}