public class Application {
private  GUIFactory factory;
private Button button;

public Application(GUIFactory f){
    this.factory =f;
    this.button =f.createButton();
}

public void createUI(){
    this.button=factory.createButton();
}

public void print(){
    button.paint();
}


}



