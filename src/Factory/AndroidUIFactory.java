package Factory;

import Factory.Component.DropDown.AndroidDropDown;
import Factory.Coponent.Button.AndroidButton;

public class AndroidUIFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropDown createDropdown() {
        return new AndroidDropDown();
    }

}