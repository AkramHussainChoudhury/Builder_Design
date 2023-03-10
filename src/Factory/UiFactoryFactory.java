package Factory;

public class UiFactoryFactory {

    public static UIFactory getUiFactoryForPlatform(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.IOS)) {
            return new IosUIFactory();
        }
        else {
            return new AndroidUIFactory();
        }
    }
}
