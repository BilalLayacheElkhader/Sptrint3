package Tasca1.Nivel1;

public class Main {
    public static void main(String[] args) {
        SingletonIngenuo singletonIngenuo = SingletonIngenuo.getInstance();
        singletonIngenuo.addElement("1");
        singletonIngenuo.addElement("2");
        singletonIngenuo.addElement("3");
        singletonIngenuo.allCommands();
        singletonIngenuo.removeElement();
        singletonIngenuo.allCommands();
    }
}
