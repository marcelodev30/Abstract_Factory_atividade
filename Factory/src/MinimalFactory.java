public class MinimalFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MinimalButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MinimalCheckbox();
    }

    @Override
    public Menu createMenu() {
        return new MinimalMenu();
    }
}
