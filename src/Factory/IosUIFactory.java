package Factory;

import Factory.Component.DropDown.DropDown;
import Factory.Component.DropDown.IosDropDown;
import Factory.Coponent.Button.Button;
import Factory.Coponent.Button.IosButton;

public class IosUIFactory implements UIFactory {

    @Override
    public DropDown createDropdown() {
        return new IosDropDown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }


}