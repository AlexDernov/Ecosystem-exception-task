package GuestList;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class GuestRepo {
   private List<Guest> guestList;

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
