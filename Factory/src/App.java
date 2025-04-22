public class APP {
    public static void main(String[] args) {
        String tipoInterface = "minimal";
        GUIFactory factory = FactoryProducer.getFactory(tipoInterface);

        Button botao = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        Menu menu = factory.createMenu();

        botao.paint();
        checkbox.paint();
        menu.paint();
    }
}
