package Factory;

import Factory.Component.DropDown.DropDown;
import Factory.Coponent.Button.Button;

public interface UIFactory {

    public Button createButton();
    public DropDown createDropdown();
}
