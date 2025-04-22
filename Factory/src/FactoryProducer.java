public class FactoryProducer {
    public static GUIFactory getFactory(String type) {
        if (type.equalsIgnoreCase("windows")) {
            return new WindowsFactory();
        } else if (type.equalsIgnoreCase("mac")) {
            return new MacFactory();
        } else if (type.equalsIgnoreCase("minimal")) {
            return new MinimalFactory();
        }
        throw new IllegalArgumentException("Tipo de fábrica não suportado: " + type);
    }
}
