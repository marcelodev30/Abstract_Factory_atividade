public class WinFactory implements GUIFactory {

    public Button createButton(){
    return WinButton();
}
    public Checkbox createCheckbox(){
        return winCheckbox();
    }

}
