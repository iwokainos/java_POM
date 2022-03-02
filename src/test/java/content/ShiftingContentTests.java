package content;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShiftingContentTests extends BaseTests {

    @Test
    public void testShiftingContentNavigation(){
        var shiftingContentPage = homePage.hitShiftingContentLink();
        var listPage = shiftingContentPage.hitLinkList();
        assert(listPage.getListPageMessage()).contains("Shifting Content: List");
    }
}
