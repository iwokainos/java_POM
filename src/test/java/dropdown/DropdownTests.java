package dropdown;

import Pages.DropdownPage;
import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage =  homePage.hitDropdownLink();
//        String dropDownOption = "Option 1";
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of select");
        assertTrue(selectedOptions.contains("Option 1"), "Option not selected");
    }

}
